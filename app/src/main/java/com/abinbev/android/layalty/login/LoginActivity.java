package com.abinbev.android.layalty.login;

import android.databinding.ViewDataBinding;
import android.os.Bundle;

import com.abinbev.android.layalty.BaseActivity;
import com.abinbev.android.layalty.R;

/**
 * Created by eltonjhony on 1/31/17.
 */
public class LoginActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void attachDefaultFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.login_container, LoginFragment.newInstance())
                .commit();
    }

    @Override
    public <T extends ViewDataBinding> T getLayout() {
        return null;
    }
}
