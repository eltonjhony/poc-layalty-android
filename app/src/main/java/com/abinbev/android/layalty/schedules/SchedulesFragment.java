package com.abinbev.android.layalty.schedules;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentSchedulesBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */
public class SchedulesFragment extends BaseFragment implements SchedulesViewContract {

    private FragmentSchedulesBinding binding;
    private SchedulesPresenterContract presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedules, container, false);
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
    public FragmentSchedulesBinding getLayout() {
        return binding;
    }

    @Override
    public void setSectionText(String text) {
        getLayout().shedulesText.setText(text);
    }

    @Override
    public void showAlertError(String error) {
        Toast.makeText(getActivitySafely(), error, Toast.LENGTH_LONG).show();
    }

    public static SchedulesFragment newInstance() {
        return new SchedulesFragment();
    }

    private void initialize() {
        this.presenter = new SchedulesPresenter(this);
    }
}
