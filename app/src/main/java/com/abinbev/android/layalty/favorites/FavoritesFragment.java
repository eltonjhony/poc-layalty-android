package com.abinbev.android.layalty.favorites;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentFavoritesBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */
public class FavoritesFragment extends BaseFragment {

    private FragmentFavoritesBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorites, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public FragmentFavoritesBinding getLayout() {
        return binding;
    }

    public static FavoritesFragment newInstance() {
        return new FavoritesFragment();
    }
}
