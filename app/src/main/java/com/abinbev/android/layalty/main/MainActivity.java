package com.abinbev.android.layalty.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.abinbev.android.layalty.BaseActivity;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.ActivityMainBinding;
import com.abinbev.android.layalty.favorites.FavoritesFragment;
import com.abinbev.android.layalty.music.MusicFragment;
import com.abinbev.android.layalty.schedules.SchedulesFragment;

/**
 * Created by eltonjhony on 1/31/17.
 */
public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setListeners();
    }

    @Override
    public void attachFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, SchedulesFragment.newInstance())
                .commit();
    }

    private void setListeners() {
        getLayout().bottomNavigation.setOnNavigationItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.action_favorites:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.main_container, FavoritesFragment.newInstance())
                            .commit();
                    break;

                case R.id.action_schedules:
                    attachFragment();
                    break;

                case R.id.action_music:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.main_container, MusicFragment.newInstance())
                            .commit();
                    break;
            }

            return true;
        });
    }

    private ActivityMainBinding getLayout() {
        return binding;
    }
}
