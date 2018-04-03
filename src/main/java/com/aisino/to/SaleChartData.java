package com.aisino.to;

import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
public class SaleChartData {

    private String name;
    private List<Integer> data;

    public SaleChartData() {
    }

    public SaleChartData(String name, List<Integer> data) {

        this.name = name;
        this.data = data;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
