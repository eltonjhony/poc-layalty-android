package com.abinbev.android.layalty.schedules;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abinbev.android.layalty.BaseFragment;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.FragmentSchedulesBinding;

/**
 * Created by eltonjhony on 2/2/17.
 */

public class SchedulesFragment extends BaseFragment {

    private FragmentSchedulesBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_schedules, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public FragmentSchedulesBinding getLayout() {
        return binding;
    }

    public static SchedulesFragment newInstance() {
        return new SchedulesFragment();
    }
}
