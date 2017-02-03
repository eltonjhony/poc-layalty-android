package com.abinbev.android.layalty.favorites;

/**
 * Created by eltonjhony on 2/3/17.
 */

public interface FavoritesInteractorContract {

    void getSectionText(final OnFavoritesTextFinishCallback callback);

    interface OnFavoritesTextFinishCallback {
        void onSuccess(final String data);
        void onFail(final String error);
    }
}
