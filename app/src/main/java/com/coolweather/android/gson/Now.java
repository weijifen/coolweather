package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author ZhangGang
 * @time 2020/4/2.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String info;
}
