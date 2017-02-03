package com.abinbev.android.layalty.music;

/**
 * Created by eltonjhony on 2/3/17.
 */
public class MusicInteractor implements MusicInteractorContract {

    @Override
    public void retrieveSectionText(OnMusicTextFinishedCallback callback) {
        callback.onSuccess("Music Section"); //TODO replace with your Business logic
    }
}
