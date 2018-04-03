package com.aisino.controller;

import com.aisino.db2.service.AuthService;
import com.aisino.db2.service.ProductService;
import com.aisino.db2.service.UserService;
import com.aisino.to.Message;
import com.aisino.to.SaleChartData;
import com.aisino.to.SaleChartResponse;
import com.aisino.vo.ProductCompanyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
@RestController
public class ChartController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    @Autowired
    private AuthService authService;

    @GetMapping("/productNames")
    public List<String> getProductNames(){
        return productService.getProductNames();
    }
    @GetMapping("/corps")
    public List<String> getDistinctCorps(){
        return userService.getDistinctCorps();
    }
    @GetMapping("/result/{str}")
    public List<ProductCompanyResult> getSelectResult(@PathVariable("str") String str){
        System.out.println(str);
        return authService.getSelectResult(str);
    }
    @GetMapping("/saleChart/{str}")
    public Message getSaleChart(@PathVariable("str") String str){
        try {
            List<String> productNames = productService.getProductNames();
            List<String> distinctCorps = userService.getDistinctCorps();
            //初始化返回
            SaleChartResponse saleChartResponse = new SaleChartResponse(productNames,authService.substr(distinctCorps));
            List<SaleChartData> saleChartDataList = new ArrayList<>();

            for (String productName : productNames) {
                SaleChartData saleChartData = authService.getSaleChartData(productName, distinctCorps,str);
                saleChartDataList.add(saleChartData);
            }
            saleChartResponse.setDataSource(saleChartDataList);
            return Message.success().add("result",saleChartResponse);
        } catch (Exception e){
            e.printStackTrace();
            return Message.fail();
        }
    }

}
