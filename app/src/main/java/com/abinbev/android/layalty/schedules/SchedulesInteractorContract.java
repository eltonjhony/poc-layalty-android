package com.abinbev.android.layalty.schedules;

/**
 * Created by eltonjhony on 2/3/17.
 */
public interface SchedulesInteractorContract {

    void retrieveSectionText(final OnSchedulesTextFinishedCallback callback);

    interface OnSchedulesTextFinishedCallback {
        void onSuccess(final String data);
        void onFail(final String error);
    }
}
