package com.xunmeng.pinduoduo.activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xunmeng.pinduoduo.AppRoute;
import com.xunmeng.pinduoduo.R;
import com.xunmeng.pinduoduo.basic.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/12/21 0021.
 */

public class SplashActivity extends BaseActivity {

    @BindView(R.id.img_launcher_display)
    ImageView imgLauncherDisplay;
    @BindView(R.id.tv_launcher_name)
    TextView tvLauncherName;
    @BindView(R.id.layout_launcher_icon)
    LinearLayout layoutLauncherIcon;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        handler.postDelayed(runnable, 1000);
    }

    private int recLen = 3;
    Handler handler = new Handler();
    /* 倒计时 */
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            recLen--;
            if (recLen == 1) {
                AppRoute.jumpToMain(getApplicationContext());
            } else {
                handler.postDelayed(this, 1000);
            }
        }
    };
}
