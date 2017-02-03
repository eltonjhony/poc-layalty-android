package com.abinbev.android.layalty.schedules;

/**
 * Created by eltonjhony on 2/3/17.
 */

public class SchedulesInteractor implements SchedulesInteractorContract {

    @Override
    public void retrieveSectionText(OnSchedulesTextFinishedCallback callback) {
        callback.onSuccess("Schedules Section"); //TODO replace with your Business logic
    }
}
