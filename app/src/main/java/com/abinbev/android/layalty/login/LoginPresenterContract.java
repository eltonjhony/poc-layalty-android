package com.abinbev.android.layalty.login;

/**
 * Created by eltonjhony on 1/31/17.
 */

public interface LoginPresenterContract {

    void attemptLogin(final String username, final String password);
    void onDestroy();
}
