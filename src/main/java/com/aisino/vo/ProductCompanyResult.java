package com.aisino.vo;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
public class ProductCompanyResult {

    private String productName;
    private String companyName;
    private int count;

    public ProductCompanyResult(String productName, String companyName) {
        this.productName = productName;
        this.companyName = companyName;
    }

    public ProductCompanyResult() {
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCompanyResult that = (ProductCompanyResult) o;

        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        return companyName != null ? companyName.equals(that.companyName) : that.companyName == null;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        return result;
    }
}
