package com.bwie.zhouxinguang1211.model;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:9:12
 *@Description:${DESCRIPTION}
 * */

import com.bwie.zhouxinguang1211.contract.Contract;
import com.bwie.zhouxinguang1211.until.Until;

import java.util.Map;

public class Imodel implements Contract.IModel {
    @Override
    public void ongetShou(String url, Class cls, Map<String, Object> map, final Contract.MycallBack mycallBack) {
        Until.getInstance().ongetShou(url, cls, map, new Until.MycallBack() {
            @Override
            public void onsuccess(Object o) {
                mycallBack.onsuccess(o);
            }

            @Override
            public void onerror(String error) {
                mycallBack.onError(error);
            }
        });
    }

    @Override
    public void onpostZeng(String url, Class cls, Map<String, Object> map, Contract.MycallBack mycallBack) {

    }

    @Override
    public void onpostMo(String url, Class cls, Map<String, Object> map, Contract.MycallBack mycallBack) {

    }

    @Override
    public void onputXiu(String url, Class cls, Map<String, Object> map, Contract.MycallBack mycallBack) {

    }
}
