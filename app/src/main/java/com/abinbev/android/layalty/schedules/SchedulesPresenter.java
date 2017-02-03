package com.abinbev.android.layalty.schedules;

/**
 * Created by eltonjhony on 2/3/17.
 */
public class SchedulesPresenter implements SchedulesPresenterContract, SchedulesInteractorContract.
        OnSchedulesTextFinishedCallback {

    private SchedulesViewContract view;
    private SchedulesInteractorContract interactor;

    public SchedulesPresenter(final SchedulesViewContract view) {
        this.view = view;
        this.interactor = new SchedulesInteractor();
    }

    @Override
    public void obtainSectionText() {
        this.interactor.retrieveSectionText(this);
    }

    @Override
    public void onDestroy() {
        this.view = null;
    }

    @Override
    public void onSuccess(String data) {
        if (view != null) {
            this.view.setSectionText(data);
        }
    }

    @Override
    public void onFail(String error) {
        if (view != null) {
            this.view.showAlertError(error);
        }
    }
}
