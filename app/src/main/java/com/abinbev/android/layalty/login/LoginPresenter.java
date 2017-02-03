package com.abinbev.android.layalty.login;

/**
 * Created by eltonjhony on 1/31/17.
 */
public class LoginPresenter implements LoginPresenterContract, LoginInteractorContract.OnLoginFinishedCallback {

    private LoginViewContract view;
    private LoginInteractorContract interactor;

    public LoginPresenter(final LoginViewContract view) {
        this.view = view;
        this.interactor = new LoginInteractor();
    }

    @Override
    public void attemptLogin(String username, String password) {
        if (view != null) {
            view.showProgress(true);
            view.enableSignButton(false);
        }

        interactor.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onUsernameError() {
        if (view != null) {
            view.setUsernameError();
            view.showProgress(false);
            view.enableSignButton(true);
        }
    }

    @Override
    public void onPasswordError() {
        if (view != null) {
            view.setPasswordError();
            view.showProgress(false);
            view.enableSignButton(true);
        }
    }

    @Override
    public void onSuccess() {
        if (view != null) {
            view.navigateToHome();
        }
    }
}
