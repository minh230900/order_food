package com.example.lunchtray.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u000e\u0010.\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u0017J\u000e\u0010/\u001a\u00020+2\u0006\u0010\u0013\u001a\u00020\u0017J\u000e\u00100\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u00101\u001a\u00020+J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u000e\u0010#\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0012R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0012\u00a8\u00066"}, d2 = {"Lcom/example/lunchtray/model/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_accompaniment", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/lunchtray/model/MenuItem;", "_entree", "_side", "_subtotal", "", "kotlin.jvm.PlatformType", "_tax", "_tip", "_total", "_totalFinaly", "accompaniment", "Landroidx/lifecycle/LiveData;", "getAccompaniment", "()Landroidx/lifecycle/LiveData;", "entree", "getEntree", "menuItems", "", "", "getMenuItems", "()Ljava/util/Map;", "previousAccompanimentPrice", "previousEntreePrice", "previousSidePrice", "side", "getSide", "subtotal", "getSubtotal", "tax", "getTax", "taxRate", "tip", "getTip", "total", "getTotal", "totalFinaly", "getTotalFinaly", "calculateTaxAndTotal", "", "resetOrder", "roundTip", "setAccompaniment", "setEntree", "setSide", "setTip1", "setTip2", "setTip3", "updateSubtotal", "itemPrice", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> menuItems = null;
    private double previousEntreePrice = 0.0;
    private double previousSidePrice = 0.0;
    private double previousAccompanimentPrice = 0.0;
    private final double taxRate = 0.08;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _entree = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> entree = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _side = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> side = null;
    private final androidx.lifecycle.MutableLiveData<com.example.lunchtray.model.MenuItem> _accompaniment = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> accompaniment = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _subtotal = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> subtotal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _total = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> total = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _tax = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> tax = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _tip = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> tip = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _totalFinaly = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> totalFinaly = null;
    
    public OrderViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.lunchtray.model.MenuItem> getMenuItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getEntree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getSide() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> getAccompaniment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSubtotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTip() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTotalFinaly() {
        return null;
    }
    
    public final void setEntree(@org.jetbrains.annotations.NotNull()
    java.lang.String entree) {
    }
    
    public final void setSide(@org.jetbrains.annotations.NotNull()
    java.lang.String side) {
    }
    
    public final void setAccompaniment(@org.jetbrains.annotations.NotNull()
    java.lang.String accompaniment) {
    }
    
    private final void updateSubtotal(double itemPrice) {
    }
    
    public final void calculateTaxAndTotal() {
    }
    
    public final void setTip1() {
    }
    
    public final void setTip2() {
    }
    
    public final void setTip3() {
    }
    
    public final void resetOrder() {
    }
    
    public final void roundTip() {
    }
}