package com.abinbev.android.layalty.Login;

/**
 * Created by eltonjhony on 1/31/17.
 */

public interface LoginPresenter {

    void attemptLogin(final String username, final String password);
    void onDestroy();
}
