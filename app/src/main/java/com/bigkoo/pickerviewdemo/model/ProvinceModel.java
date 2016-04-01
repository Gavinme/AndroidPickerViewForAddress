package com.bigkoo.pickerviewdemo.model;

import java.util.ArrayList;
import java.util.List;

public class ProvinceModel {
    private String name;
    private List<CityModel> cityList;


    public List<List<String>> getDisNameList() {
        List<List<String>> list = new ArrayList<>();
        for (CityModel cityModel : cityList) {
            list.add(cityModel.getDisList());
        }
        return list;
    }

    public List<String> getCityNameList() {
        List<String> list = new ArrayList<>();
        for (CityModel cityModel : cityList) {
            list.add(cityModel.getPickerViewText());
        }
        return list;
    }

    public ProvinceModel() {
        super();
    }

    public ProvinceModel(String name, List<CityModel> cityList) {
        super();
        this.name = name;
        this.cityList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CityModel> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityModel> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "ProvinceModel [name=" + name + ", cityList=" + cityList + "]";
    }

    public String getPickerViewText() {
        //这里还可以判断文字超长截断再提供显示
        return name;
    }
}
