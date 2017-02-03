package com.abinbev.android.layalty.music;

/**
 * Created by eltonjhony on 2/3/17.
 */
public class MusicPresenter implements MusicPresenterContract, MusicInteractorContract.OnMusicTextFinishedCallback {

    private MusicViewContract view;
    private MusicInteractorContract interactor;

    public MusicPresenter(final MusicViewContract view) {
        this.view = view;
        this.interactor = new MusicInteractor();
    }

    @Override
    public void obtainSectionText() {
        interactor.retrieveSectionText(this);
    }

    @Override
    public void onDestroy() {
        this.view = null;
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
