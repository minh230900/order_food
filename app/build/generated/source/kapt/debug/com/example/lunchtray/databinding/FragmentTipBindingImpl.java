package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTipBindingImpl extends FragmentTipBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.how_the_service, 8);
        sViewsWithIds.put(R.id.tip_options, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTipBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentTipBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[2]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[5]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.TextView) bindings[1]
            );
        this.calculateButton.setTag(null);
        this.cancelButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.optionEighteenPercent.setTag(null);
        this.optionFifteenPercent.setTag(null);
        this.optionTwentyPercent.setTag(null);
        this.roundUpSwitch.setTag(null);
        this.totalNoTip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        mCallback13 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback10 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback11 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback9 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tipFragment == variableId) {
            setTipFragment((com.example.lunchtray.ui.order.TipFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTipFragment(@Nullable com.example.lunchtray.ui.order.TipFragment TipFragment) {
        this.mTipFragment = TipFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tipFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.lunchtray.ui.order.TipFragment tipFragment = mTipFragment;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTotal = null;
        java.lang.String totalNoTipAndroidStringTotalViewModelTotal = null;
        java.lang.String viewModelTotalGetValue = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.total
                    viewModelTotal = viewModel.getTotal();
                }
                updateLiveDataRegistration(0, viewModelTotal);


                if (viewModelTotal != null) {
                    // read viewModel.total.getValue()
                    viewModelTotalGetValue = viewModelTotal.getValue();
                }


                // read @android:string/total
                totalNoTipAndroidStringTotalViewModelTotal = totalNoTip.getResources().getString(R.string.total, viewModelTotalGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.calculateButton.setOnClickListener(mCallback12);
            this.cancelButton.setOnClickListener(mCallback13);
            this.optionEighteenPercent.setOnClickListener(mCallback9);
            this.optionFifteenPercent.setOnClickListener(mCallback10);
            this.optionTwentyPercent.setOnClickListener(mCallback8);
            this.roundUpSwitch.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalNoTip, totalNoTipAndroidStringTotalViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // tipFragment
                com.example.lunchtray.ui.order.TipFragment tipFragment = mTipFragment;
                // tipFragment != null
                boolean tipFragmentJavaLangObjectNull = false;



                tipFragmentJavaLangObjectNull = (tipFragment) != (null);
                if (tipFragmentJavaLangObjectNull) {


                    tipFragment.showFinalScoreDialog();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // tipFragment
                com.example.lunchtray.ui.order.TipFragment tipFragment = mTipFragment;
                // tipFragment != null
                boolean tipFragmentJavaLangObjectNull = false;



                tipFragmentJavaLangObjectNull = (tipFragment) != (null);
                if (tipFragmentJavaLangObjectNull) {


                    tipFragment.cancelOrder();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setTip3();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.roundTip();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setTip2();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setTip1();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.total
        flag 1 (0x2L): tipFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}