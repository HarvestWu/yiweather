package com.yiweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 吴金秋 on 2017/3/28.
 */

public class Province extends DataSupport {

    private int id;//每个实体都应有字段
    private String provinceName;//记录省得名字
    private int provinceCode;//记录省的代号

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

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
