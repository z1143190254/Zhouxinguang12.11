package com.bwie.zhouxinguang1211.base;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:9:13
 *@Description:${DESCRIPTION}
 * */

import com.bwie.zhouxinguang1211.contract.Contract;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends Contract.Iview> implements Contract.Presenter {
    protected WeakReference<V> weakReference;

    public BasePresenter() {
        inisModel();
    }

    protected void Attach(V v) {
        weakReference = new WeakReference<>(v);
    }

    protected void onDesAttach() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }

    }

    protected abstract void inisModel();

    protected V get() {
        return weakReference.get();
    }
}
