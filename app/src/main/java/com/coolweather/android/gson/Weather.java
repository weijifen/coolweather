package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author ZhangGang
 * @time 2020/4/2.
 */
public class Weather {
    public String status;
    public Basic basic;
    @SerializedName("update")
    public WeatherUpdate weatherUpdate;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    @SerializedName("lifestyle")
    public List<LifeStyle> lifeStyleList;
}
