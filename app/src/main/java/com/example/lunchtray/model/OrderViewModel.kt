/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.model

import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.lunchtray.R
import com.example.lunchtray.data.DataSource
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.text.NumberFormat

class OrderViewModel : ViewModel() {


    val menuItems = DataSource.menuItems

    // Default values for item prices
    private var previousEntreePrice = 0.0
    private var previousSidePrice = 0.0
    private var previousAccompanimentPrice = 0.0


    private val taxRate = 0.08

    private val _entree = MutableLiveData<MenuItem?>()
    val entree: LiveData<MenuItem?> = _entree


    private val _side = MutableLiveData<MenuItem?>()
    val side: LiveData<MenuItem?> = _side


    private val _accompaniment = MutableLiveData<MenuItem?>()
    val accompaniment: LiveData<MenuItem?> = _accompaniment


    private val _subtotal = MutableLiveData(0.0)
    val subtotal: LiveData<String> = Transformations.map(_subtotal) {
        NumberFormat.getCurrencyInstance().format(it)
    }

    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = Transformations.map(_total) {
        NumberFormat.getCurrencyInstance().format(it)
    }


    private val _tax = MutableLiveData(0.0)
    val tax: LiveData<String> = Transformations.map(_tax) {
        NumberFormat.getCurrencyInstance().format(it)
    }
    private val _tip = MutableLiveData(0.0)
    val tip: LiveData<String> = Transformations.map(_tip)
    {
        NumberFormat.getCurrencyInstance().format(it)
    }
    private val _totalFinaly = MutableLiveData(0.0)
    val totalFinaly: LiveData<String> = Transformations.map(_totalFinaly)
    {
        NumberFormat.getCurrencyInstance().format(it)
    }


    fun setEntree(entree: String) {

       if(_entree.value !=null)
       {
           previousEntreePrice = _entree.value!!.price
       }
        if (_subtotal.value !=null) {
            _subtotal.value = _subtotal.value!! - previousEntreePrice
        }
        _entree.value = menuItems[entree]
        updateSubtotal(_entree.value!!.price)


    }


    fun setSide(side: String) {
        if (_side.value != null)
        {
            previousSidePrice = _side.value!!.price
        }
        if (_subtotal.value != null)
        {
            _subtotal.value = _subtotal.value!! - previousSidePrice
        }
        _side.value = menuItems[side]
        updateSubtotal(_side.value!!.price)

    }


    fun setAccompaniment(accompaniment: String) {
        if (_accompaniment.value != null)
        {
            previousAccompanimentPrice = _accompaniment.value!!.price
        }
        if(_subtotal.value !=  null)
        {

            _subtotal.value = _subtotal.value!!  - previousAccompanimentPrice
        }
        _accompaniment.value = menuItems[accompaniment]
        updateSubtotal(_accompaniment.value!!.price)

    }


    private fun updateSubtotal(itemPrice: Double) {
        if (_subtotal.value != null)
        {
            _subtotal.value = _subtotal.value!! + itemPrice
        }
        else
        {
            _subtotal.value = itemPrice
        }
        calculateTaxAndTotal()

    }

    fun calculateTaxAndTotal() {
        _tax.value = taxRate * _subtotal.value!!
        _total.value = _subtotal.value!! + _tax.value!!

    }
    fun setTip1() {
        if (_total.value != null)
        {
            _total.value = 0.0
        }
        _total.value = (_subtotal.value!! + _tax.value!!) * 1.2

    }
    fun setTip2() {

        if (_total.value != null)
        {
            _total.value = 0.0
        }
        _total.value = (_subtotal.value!! + _tax.value!!) * 1.18

    }
    fun setTip3() {
        if (_total.value != null)
        {
            _total.value = 0.0
        }
        _total.value = (_subtotal.value!! + _tax.value!!) * 1.15
    }

        fun resetOrder() {
            _entree.value = null
            _side.value = null
            _accompaniment.value = null
            _subtotal.value = 0.0
            _total.value = 0.0
            _subtotal.value = 0.0
            _tax.value = 0.0
            previousEntreePrice = 0.0
            previousSidePrice = 0.0
            previousAccompanimentPrice = 0.0

        }
    fun roundTip()
    {
        _total.value = kotlin.math.ceil(_total.value!!)
    }


}
