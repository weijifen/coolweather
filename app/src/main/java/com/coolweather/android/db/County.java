package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author ZhangGang
 * @time 2020/3/30.
 */
public class County extends LitePalSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
