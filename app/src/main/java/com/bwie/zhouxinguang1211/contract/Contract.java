package com.bwie.zhouxinguang1211.contract;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:9:08
 *@Description:${DESCRIPTION}
 * */

import java.util.Map;

public interface Contract {
    interface MycallBack<T> {
        void onsuccess(T t);

        void onError(String error);
    }

    interface IModel {
        void ongetShou(String url, Class cls, Map<String, Object> map, MycallBack mycallBack);

        void onpostZeng(String url, Class cls, Map<String, Object> map, MycallBack mycallBack);

        void onpostMo(String url, Class cls, Map<String, Object> map, MycallBack mycallBack);

        void onputXiu(String url, Class cls, Map<String, Object> map, MycallBack mycallBack);
    }

    interface Iview<T> {
        void onsuccess(T t);

        void onError(String error);
    }

    interface Presenter {
        void onstartgetShou(String url, Map<String, Object> map, Class cls);

        void onstartpostZeng(String url, Map<String, Object> map, Class cls);

        void onstartpostMo(String url, Map<String, Object> map, Class cls);

        void onstartputXiu(String url, Map<String, Object> map, Class cls);

    }


}
