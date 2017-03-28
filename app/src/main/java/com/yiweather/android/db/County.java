package com.yiweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 吴金秋 on 2017/3/28.
 */

public class County extends DataSupport {

    private int id;//每个实体应有的字段
    private String countyName;//记录县的名字
    private String weatherId;//记录县所对应的天气id
    private int cityId;//记录当前县所属市的id

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

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
