package com.xunmeng.pinduoduo.fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.xunmeng.pinduoduo.R;
import com.xunmeng.pinduoduo.basic.BaseFragment;
import com.xunmeng.pinduoduo.widget.smarttablayout.SmartTabLayout;

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

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getChildFragmentManager(), FragmentPagerItems.with(getContext())
                .add("11", ContentFragment.class)
                .add("222", ContentFragment.class)
                .create());

        ViewPager viewPager = (ViewPager) root.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) root.findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);

    }

    @Override
    protected void initData() {
        super.initData();



    }
}
