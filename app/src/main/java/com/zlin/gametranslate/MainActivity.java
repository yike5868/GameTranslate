package com.zlin.gametranslate;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.zlin.gametranslate.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @BindView(R.id.view_pager)
    ViewPager view_pager;
    @BindView(R.id.tab_layout)
    TabLayout tab_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        initEvents();
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initEvents() {

    }
}
