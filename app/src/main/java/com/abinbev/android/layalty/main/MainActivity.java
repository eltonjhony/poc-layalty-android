package com.abinbev.android.layalty.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.abinbev.android.layalty.BaseActivity;
import com.abinbev.android.layalty.R;
import com.abinbev.android.layalty.databinding.ActivityMainBinding;
import com.abinbev.android.layalty.favorites.FavoritesFragment;
import com.abinbev.android.layalty.login.LoginActivity;
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

        initialize();
        setListeners();
    }

    @Override
    public void attachDefaultFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, SchedulesFragment.newInstance())
                .commit();
    }

    @Override
    public ActivityMainBinding getLayout() {
        return binding;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        final int itemId = item.getItemId();

        switch (itemId) {
            case R.id.action_logout:
                startActivity(new Intent(this, LoginActivity.class)); //TODO Replace with your Logout logic
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void initialize() {
        // set default item selected on bottom nav
        binding.bottomNavigation.getMenu().getItem(1).setChecked(true);
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
                    attachDefaultFragment();
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
}
