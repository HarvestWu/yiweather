package com.yiweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 吴金秋 on 2017/3/28.
 */

/**
 * City的实体类
 */
public class City extends DataSupport {

    private int id; //每个实体应有的字段
    private String cityName;//记录市的名字
    private int cityCode;//记录市的代号
    private int provinceId;//记录当前市所属省得id

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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
