package com.abinbev.android.layalty.Main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abinbev.android.layalty.BaseActivity;
import com.abinbev.android.layalty.R;

/**
 * Created by eltonjhony on 1/31/17.
 */

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void attachFragment() {
    }
}
