package com.abinbev.android.layalty.favorites;

/**
 * Created by eltonjhony on 2/3/17.
 */
public class FavoritesPresenter implements FavoritesPresenterContract, FavoritesInteractorContract.OnFavoritesTextFinishCallback {

    private FavoritesViewContract view;
    private FavoritesInteractorContract interactor;

    public FavoritesPresenter(final FavoritesViewContract view) {
        this.view = view;
        this.interactor = new FavoritesInteractor();
    }

    @Override
    public void retrieveSectionText() {
        interactor.getSectionText(this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onSuccess(String data) {
        if (view != null) {
            view.setSectionText(data);
        }
    }

    @Override
    public void onFail(String error) {
        if (view != null) {
            view.showAlertError(error);
        }
    }
}
