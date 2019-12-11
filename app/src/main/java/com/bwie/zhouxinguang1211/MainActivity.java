package com.bwie.zhouxinguang1211;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.bwie.zhouxinguang1211.base.BaseActivity;
import com.bwie.zhouxinguang1211.base.BasePresenter;
import com.bwie.zhouxinguang1211.presenter.Presenter;

public class MainActivity extends BaseActivity {

    private RecyclerView recy;

    @Override
    protected void startCoding() {

    }

    @Override
    protected BasePresenter inisPresenter() {
        return new Presenter();
    }

    @Override
    protected void inisView() {
        recy = (RecyclerView) findViewById(R.id.recy);

    }

    @Override
    protected int inisid() {
        return R.layout.activity_main;
    }

    @Override
    public void onsuccess(Object o) {

    }

    @Override
    public void onError(String error) {

    }
}
