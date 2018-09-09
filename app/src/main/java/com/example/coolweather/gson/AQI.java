package com.example.coolweather.gson;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/31.
 * 该类主要实现
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
