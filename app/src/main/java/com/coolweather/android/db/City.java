package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author ZhangGang
 * @time 2020/3/30.
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
