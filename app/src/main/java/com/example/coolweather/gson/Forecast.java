package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/31.
 * 该类主要实现
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
