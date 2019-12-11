package com.bwie.zhouxinguang1211.api;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:8:49
 *@Description:${DESCRIPTION}
 * */

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Observable<ResponseBody> getInfoShou(@Url String url, @HeaderMap Map<String, Object> map);

    @POST
    Observable<ResponseBody> postInfoZeng(@Url String url, @HeaderMap Map<String, Object> map);

    @POST
    Observable<ResponseBody> postInfoMo(@Url String url, @HeaderMap Map<String, Object> map);

    @PUT
    Observable<ResponseBody> putInfoXiu(@Url String url, @HeaderMap Map<String, Object> map);
}
