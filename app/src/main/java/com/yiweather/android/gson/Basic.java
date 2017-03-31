package com.yiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 吴金秋 on 2017/3/31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
