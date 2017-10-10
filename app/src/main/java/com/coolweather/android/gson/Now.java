package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zc on 2017/10/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("tet")
        public String info;
    }
}
