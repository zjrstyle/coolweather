package com.coolweather.android.gson;

/**
 * Created by zc on 2017/10/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
