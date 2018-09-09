package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/31.
 * 该类主要实现
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
