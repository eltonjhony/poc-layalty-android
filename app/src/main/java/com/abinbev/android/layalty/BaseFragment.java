package com.abinbev.android.layalty;

import android.app.Activity;
import android.content.Context;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by eltonjhony on 1/31/17.
 */
public abstract class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dismissKeyboard();
    }

    protected Activity getActivitySafely() throws RuntimeException {
        if (!isAdded()) {
            throw new RuntimeException();
        }
        return getActivity();
    }

    protected void dismissKeyboard() {
        Activity activity = getActivitySafely();
        if (activity != null && activity.getCurrentFocus() != null) {
            try {
                InputMethodManager inputManager =
                        (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
            } catch (Exception e) {
                Log.e(this.getClass().getSimpleName(), "Unable to dismiss the keyboard.");
            }
        }
    }

    protected void showKeyboard(View viewToFocus) {
        Activity activity = getActivitySafely();
        InputMethodManager imm =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        new Handler().postDelayed(
                () -> imm.showSoftInput(viewToFocus, InputMethodManager.SHOW_IMPLICIT), 50);
    }

    public abstract <T extends ViewDataBinding> T getLayout();
}
