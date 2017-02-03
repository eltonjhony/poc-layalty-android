package com.abinbev.android.layalty.login;

/**
 * Created by eltonjhony on 1/31/17.
 */

public interface LoginInteractorContract {

    interface OnLoginFinishedCallback {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedCallback callback);
}
