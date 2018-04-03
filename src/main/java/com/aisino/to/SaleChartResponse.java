package com.aisino.to;

import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
public class SaleChartResponse {

    private List<String> productList;
    private List<String> customCompany;
    private List<SaleChartData> dataSource;

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public List<String> getCustomCompany() {
        return customCompany;
    }

    public void setCustomCompany(List<String> customCompany) {
        this.customCompany = customCompany;
    }

    public List<SaleChartData> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<SaleChartData> dataSource) {
        this.dataSource = dataSource;
    }

    public SaleChartResponse() {
    }

    public SaleChartResponse(List<String> productList, List<String> customCompany) {

        this.productList = productList;
        this.customCompany = customCompany;
    }
}
