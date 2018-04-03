package com.aisino.db2.service;

import com.aisino.db2.dao.AuthMapper;
import com.aisino.to.SaleChartData;
import com.aisino.vo.ProductCompanyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
@Service
public class AuthService {

    @Autowired
    private AuthMapper authMapper;

    public List<ProductCompanyResult> getSelectResult(String str){
        List<ProductCompanyResult> selectResult = authMapper.getSelectResult(str);
        return selectResult;
    }

    /**
     * 根据传入的产品名称和公司列表返回SaleChartData对象
     * 0试用1正式
     * @param productName
     * @param distinctCorps
     * @return
     */
    public SaleChartData getSaleChartData(String productName, List<String> distinctCorps,String str){
        //获取数据表的data
        List<ProductCompanyResult> selectResult = this.getSelectResult(str);
        //保存count的结果数据
        List<Integer> data = new ArrayList<>();
        //外层循环获取每个地市
        for (String corp : distinctCorps) {
            Integer count = 0;
            ProductCompanyResult var = new ProductCompanyResult(productName, corp);
            //内层循环获取每个结果集
            for (ProductCompanyResult productCompanyResult : selectResult) {
                if(var.equals(productCompanyResult)){
                    count = productCompanyResult.getCount();
                    break;
                }
            }
            data.add(count);
        }
        return new SaleChartData(productName,data);
    }

    public List<String> substr(List<String> companyNames){
        List<String> list = new ArrayList<>();
        for (String companyName : companyNames) {
            if(companyName.equals("辽宁航天信息有限公司")){
                list.add("航信");
            }else{
                list.add(companyName.substring(13,companyName.lastIndexOf("分")));
            }
        }
        return list;
    }
}
