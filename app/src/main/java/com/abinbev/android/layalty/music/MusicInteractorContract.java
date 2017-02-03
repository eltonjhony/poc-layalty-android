package com.abinbev.android.layalty.music;

/**
 * Created by eltonjhony on 2/3/17.
 */

public interface MusicInteractorContract {

    void retrieveSectionText(final OnMusicTextFinishedCallback callback);

    interface OnMusicTextFinishedCallback {
        void onSuccess(final String data);
        void onFail(final String error);
    }
}
