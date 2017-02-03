package com.abinbev.android.layalty.music;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentMusicBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */
public class MusicFragment extends BaseFragment implements MusicViewContract {

    private FragmentMusicBinding binding;
    private MusicPresenterContract presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_music, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.initialize();

        presenter.obtainSectionText();
    }

    @Override
    public void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public FragmentMusicBinding getLayout() {
        return binding;
    }

    @Override
    public void setSectionText(String text) {
        getLayout().musicText.setText(text);
    }

    @Override
    public void showAlertError(String error) {
        Toast.makeText(getActivitySafely(), error, Toast.LENGTH_LONG).show();
    }

    public static MusicFragment newInstance() {
        return new MusicFragment();
    }

    private void initialize() {
        this.presenter = new MusicPresenter(this);
    }
}
