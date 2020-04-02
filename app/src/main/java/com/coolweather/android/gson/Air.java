package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author ZhangGang
 * @time 2020/4/2.
 */
public class Air {
    public String status;
    public Basic basic;
    @SerializedName("update")
    public WeatherUpdate weatherUpdate;
    @SerializedName("air_now_city")
    public AirNowCity airNowCity;
}
