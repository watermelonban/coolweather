package com.watermelonban.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by watermelonBan on 2016/12/29.
 * Email yangfan5314@163.com
 */

//县
public class County extends DataSupport {
    private int id;

    private String countyName;
    //县对应的天气id
    private int weatherId;
    //城市外键
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
