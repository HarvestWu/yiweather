package com.yiweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 吴金秋 on 2017/3/28.
 */

/**
 *与服务器进行交互
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
