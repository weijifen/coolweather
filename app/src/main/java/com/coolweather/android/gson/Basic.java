package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author ZhangGang
 * @time 2020/4/2.
 */
public class Basic {
    @SerializedName("location")
    public String cityName;
    @SerializedName("cid")
    public String weatherId;
}
