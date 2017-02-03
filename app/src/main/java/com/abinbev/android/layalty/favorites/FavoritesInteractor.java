package com.abinbev.android.layalty.favorites;

/**
 * Created by eltonjhony on 2/3/17.
 */

public class FavoritesInteractor implements FavoritesInteractorContract {

    @Override
    public void getSectionText(OnFavoritesTextFinishCallback callback) {
        callback.onSuccess("Favorites Section"); //TODO replace with your Business logic
    }
}
