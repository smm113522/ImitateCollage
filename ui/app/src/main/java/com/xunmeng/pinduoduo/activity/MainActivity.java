package com.xunmeng.pinduoduo.activity;

import android.support.v4.app.Fragment;

import com.xunmeng.pinduoduo.R;
import com.xunmeng.pinduoduo.basic.BaseActivity;
import com.xunmeng.pinduoduo.fragment.NavFragment;
import com.xunmeng.pinduoduo.fragment.OnTabReselectListener;
import com.xunmeng.pinduoduo.widget.NavigationButton;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements NavFragment.OnNavigationReselectListener {

    @BindView(R.id.fag_nav)
    NavFragment fagNav;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        fagNav.setup(this, getSupportFragmentManager(), R.id.main_container, this);
    }

    @Override
    public void onReselect(NavigationButton navigationButton) {
        Fragment fragment = navigationButton.getFragment();
        if (fragment != null
                && fragment instanceof OnTabReselectListener) {
            OnTabReselectListener listener = (OnTabReselectListener) fragment;
            listener.onTabReselect();
        }
    }
}
