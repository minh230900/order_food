
package com.example.lunchtray.ui.order

import android.app.ProgressDialog.show
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lunchtray.R
import com.example.lunchtray.databinding.FragmentCheckoutBinding
import com.example.lunchtray.model.OrderViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder



class CheckoutFragment : Fragment() {


    private var _binding: FragmentCheckoutBinding? = null


    private val binding get() = _binding!!


    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        val root = binding.root


        sharedViewModel.calculateTaxAndTotal()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            checkOutFragment = this@CheckoutFragment

        }
    }


    fun cancelOrder() {
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_checkoutFragment_to_startOrderFragment)
    }


    fun submitOrder() {

        //sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_checkoutFragment_to_tipFragment)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun showFinalScoreDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.chuc_mung)
            .setMessage(getString(R.string.tong_tien, sharedViewModel.total.value))
            .setCancelable(false)
            .setNegativeButton(getString(R.string.exit)) { _, _ ->
                exitGame()}
            .setPositiveButton(getString(R.string.dat_lai_mon)) { _, _ ->
                sharedViewModel.resetOrder()}
            .show()
            }

    private fun exitGame() {
        activity?.finish()
    }
}

