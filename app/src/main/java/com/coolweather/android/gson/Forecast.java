package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author ZhangGang
 * @time 2020/4/2.
 */
public class Forecast {

//    {
//                    "cond_code_d": "100",
//                    "cond_code_n": "101",
//                    "cond_txt_d": "晴",
//                    "cond_txt_n": "多云",
//                    "date": "2020-04-02",
//                    "tmp_max": "17",
//                    "tmp_min": "10",
//                }

    public String date;
    @SerializedName("tmp_max")
    public String tmpMax;
    @SerializedName("tmp_min")
    public String tmpMin;
    @SerializedName("cond_txt_d")
    public String info;
}
