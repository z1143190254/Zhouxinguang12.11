package com.bwie.zhouxinguang1211.url;
/*
 *@auther:周鑫光
 *@Date: 2019/12/11
 *@Time:8:55
 *@Description:${DESCRIPTION}
 * */

public interface MyUrls {
    String Base = "http://172.17.8.100/small/";
    //    收货地址列表
    String Shou = "user/verify/v1/receiveAddressList";
    //    增加收货地址
    String Zeng = "user/verify/v1/addReceiveAddress";
    //默认收货地址
    String Mo = "user/verify/v1/setDefaultReceiveAddress";
    //    修改
    String Xiu = "user/verify/v1/changeReceiveAddress";
}
