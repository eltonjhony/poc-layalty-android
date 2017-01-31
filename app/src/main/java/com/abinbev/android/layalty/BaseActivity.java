package com.abinbev.android.layalty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by eltonjhony on 1/31/17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (savedInstanceState == null) {
            attachFragment();
        }
    }

    public abstract void attachFragment();
}
