package com.bwie.zhouxinguang1211.presenter;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:9:13
 *@Description:${DESCRIPTION}
 * */

import com.bwie.zhouxinguang1211.base.BasePresenter;
import com.bwie.zhouxinguang1211.contract.Contract;
import com.bwie.zhouxinguang1211.model.Imodel;

import java.util.Map;

public class Presenter extends BasePresenter {

    private Contract.IModel imodel;

    @Override
    protected void inisModel() {
        imodel = new Imodel();
    }

    @Override
    public void onstartgetShou(String url, Map<String, Object> map, Class cls) {
        imodel.ongetShou(url, cls, map, new Contract.MycallBack() {
            @Override
            public void onsuccess(Object o) {
                get().onsuccess(o);
            }

            @Override
            public void onError(String error) {
                get().onError(error);
            }
        });
    }

    @Override
    public void onstartpostZeng(String url, Map<String, Object> map, Class cls) {

    }

    @Override
    public void onstartpostMo(String url, Map<String, Object> map, Class cls) {

    }

    @Override
    public void onstartputXiu(String url, Map<String, Object> map, Class cls) {

    }
}
