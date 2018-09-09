package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/31.
 * 该类主要实现
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
