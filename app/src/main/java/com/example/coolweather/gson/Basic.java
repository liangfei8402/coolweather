package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/30.
 * 该类主要实现
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
