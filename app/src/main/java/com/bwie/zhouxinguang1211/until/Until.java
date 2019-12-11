package com.bwie.zhouxinguang1211.until;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:9:00
 *@Description:${DESCRIPTION}
 * */

import com.bwie.zhouxinguang1211.api.ApiService;
import com.bwie.zhouxinguang1211.url.MyUrls;
import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Until {

    private OkHttpClient okHttpClient;
    private HttpLoggingInterceptor interceptor;
    private static final Until ourInstance = new Until();
    private final ApiService apiService;

    public static Until getInstance() {
        return ourInstance;
    }

    private Until() {
        interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyUrls.Base)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public void ongetShou(String url, final Class cls, Map<String, Object> map, final MycallBack mycallBack) {
        apiService.getInfoShou(MyUrls.Shou, map).observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        if (mycallBack != null) {
                            Object o = new Gson().fromJson(responseBody.string(), cls);
                            mycallBack.onsuccess(o);

                        }

                    }
                });
    }

    public void onpostZeng(String url, final Class cls, Map<String, Object> map, final MycallBack mycallBack) {
        apiService.postInfoZeng(MyUrls.Zeng, map).observeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        if (mycallBack != null) {
                            Object o = new Gson().fromJson(responseBody.string(), cls);
                            mycallBack.onsuccess(o);
                        }
                    }
                });

    }


    public interface MycallBack<T> {
        void onsuccess(T t);

        void onerror(String error);
    }
}
