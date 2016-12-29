package com.watermelonban.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by watermelonBan on 2016/12/29.
 * Email yangfan5314@163.com
 */

//省
public class Province extends DataSupport {

    private int id;
    //省的名称
    private String provinceName;
    //省代码
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
