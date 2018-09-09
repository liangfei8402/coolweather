package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 包名com.example.coolweather.gson
 * Created by liangfei on 2018/8/31.
 * 该类主要实现
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
