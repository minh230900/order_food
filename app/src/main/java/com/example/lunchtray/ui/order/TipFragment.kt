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
import com.example.lunchtray.databinding.FragmentEntreeMenuBinding
import com.example.lunchtray.databinding.FragmentTipBinding
import com.example.lunchtray.model.OrderViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.text.NumberFormat


class TipFragment : Fragment() {
    private var _binding: FragmentTipBinding? = null
    private val binding get() = _binding!!
    private val sharedViewModel: OrderViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTipBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            tipFragment = this@TipFragment

        }


    }


    fun cancelOrder() {
        sharedViewModel.resetOrder()
        findNavController().navigate(R.id.action_tipFragment_to_startOrderFragment)
    }

    fun showFinalScoreDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.chuc_mung)
            .setMessage(getString(R.string.tong_tien, sharedViewModel.total.value))
            .setCancelable(false)
            .setNegativeButton(getString(R.string.exit)) { _, _ ->
                exitGame()}
            .setPositiveButton(getString(R.string.dat_lai_mon)) { _, _ ->
                cancelOrder()}
            .show()
    }
    private fun exitGame() {
        activity?.finish()
    }




}