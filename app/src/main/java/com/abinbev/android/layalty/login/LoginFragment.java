package com.abinbev.android.layalty.login;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.main.MainActivity;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentLoginBinding;

import static com.abinbev.android.layalty.R.string.error_invalid_email;
import static com.abinbev.android.layalty.R.string.error_invalid_password;

/**
 * Created by eltonjhony on 1/31/17.
 */
public class LoginFragment extends BaseFragment implements LoginView {

    private LoginPresenter presenter;
    private FragmentLoginBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        return getLayout().getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.initialize();
        this.setListeners();
    }

    @Override
    public FragmentLoginBinding getLayout() {
        return binding;
    }

    @Override
    public void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress(final boolean visible) {
        if (visible) {
            getLayout().progress.setVisibility(View.VISIBLE);
        } else {
            getLayout().progress.setVisibility(View.GONE);
        }
    }

    @Override
    public void enableSignButton(final boolean enabled) {
        getLayout().emailSignInButton.setEnabled(enabled);
    }

    @Override
    public void setUsernameError() {
        getLayout().email.setError(getString(error_invalid_email));
    }

    @Override
    public void setPasswordError() {
        getLayout().password.setError(getString(error_invalid_password));
    }

    @Override
    public void navigateToHome() {
        final Activity parentActivity = getActivitySafely();
        parentActivity.startActivity(new Intent(parentActivity, MainActivity.class));
        parentActivity.finish();
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    private void initialize() {
        this.presenter = new LoginPresenterImpl(this);
    }

    private void setListeners() {
        getLayout().emailSignInButton.setOnClickListener(v ->
            presenter.attemptLogin(getLayout().email.getText().toString(), getLayout().password.getText().toString())
        );
    }
}
