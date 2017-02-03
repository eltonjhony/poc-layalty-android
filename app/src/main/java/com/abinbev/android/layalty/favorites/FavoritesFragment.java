package com.abinbev.android.layalty.favorites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentFavoritesBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */
public class FavoritesFragment extends BaseFragment implements FavoritesViewContract {

    private FragmentFavoritesBinding binding;
    private FavoritesPresenterContract presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorites, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.initialize();
        presenter.retrieveSectionText();
    }

    @Override
    public void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public FragmentFavoritesBinding getLayout() {
        return binding;
    }

    @Override
    public void setSectionText(String text) {
        getLayout().favoritesText.setText(text);
    }

    @Override
    public void showAlertError(String error) {
        Toast.makeText(getActivitySafely(), error, Toast.LENGTH_LONG).show();
    }

    public static FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }

    private void initialize() {
        presenter = new FavoritesPresenter(this);
    }
}
