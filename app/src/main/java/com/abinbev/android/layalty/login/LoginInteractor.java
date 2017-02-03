package com.abinbev.android.layalty.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by eltonjhony on 1/31/17.
 */
public class LoginInteractor implements LoginInteractorContract {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedCallback callback) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(() -> {
            boolean error = false;
            if (TextUtils.isEmpty(username)) {
                callback.onUsernameError();
                error = true;
                return;
            }

            if (TextUtils.isEmpty(password)) {
                callback.onPasswordError();
                error = true;
                return;
            }

            if (!error) {
                callback.onSuccess();
            }
        }, 2000);

    }
}
