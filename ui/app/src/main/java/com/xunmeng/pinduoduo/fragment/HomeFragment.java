package com.xunmeng.pinduoduo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.xunmeng.pinduoduo.R;
import com.xunmeng.pinduoduo.basic.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/12/22 0022.
 */

public class HomeFragment extends BaseFragment implements OnTabReselectListener {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void onTabReselect() {

        Toast.makeText(getContext(), "ddd", Toast.LENGTH_LONG).show();
    }

}
