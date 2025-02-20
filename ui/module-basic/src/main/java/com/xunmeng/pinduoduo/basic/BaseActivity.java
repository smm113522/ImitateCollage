package com.xunmeng.pinduoduo.basic;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/12/21 0021.
 */

public abstract class BaseActivity<T extends BasePresenter, E extends BaseModel>  extends AppCompatActivity {

    public T mPresenter;
    public E mModel;
    private Unbinder unbinder;

    public Activity getActivity() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    protected void init() {
//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(getLayoutResID());
        unbinder = ButterKnife.bind(this);
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        if (this instanceof BaseView) mPresenter.setVM(this, mModel);

        initView();
    }
    /**
     * 获得Layout文件id
     *
     * @return
     */
    protected abstract int getLayoutResID();

    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
