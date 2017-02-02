package com.abinbev.android.layalty.music;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentMusicBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */
public class MusicFragment extends BaseFragment {

    private FragmentMusicBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_music, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public FragmentMusicBinding getLayout() {
        return binding;
    }

    public static MusicFragment newInstance() {
        return new MusicFragment();
    }
}
