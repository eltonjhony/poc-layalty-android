package com.abinbev.android.layalty.login;

/**
 * Created by eltonjhony on 1/31/17.
 */
public interface LoginView {

    void showProgress(final boolean visible);

    void enableSignButton(final boolean isEnable);

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
