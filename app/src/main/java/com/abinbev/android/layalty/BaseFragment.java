package com.abinbev.android.layalty;

import android.app.Activity;
import android.app.Fragment;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by eltonjhony on 1/31/17.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    protected Activity getActivitySafely() throws RuntimeException {
        if (!isAdded()) {
            throw new RuntimeException();
        }
        return getActivity();
    }

    public abstract <T extends ViewDataBinding> T getLayout();
}
