package com.aisino.db2.service;

import com.aisino.db2.dao.ProductMapper;
import com.aisino.db2.domain.Product;
import com.aisino.db2.domain.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/30.
 */
@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<String> getProductNames(){
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andStateEqualTo("1").andProductIdNotEqualTo(56);
        productExample.setOrderByClause("'PRODUCT_ID' DESC");
        List<Product> products = productMapper.selectByExample(productExample);
        List<String> productNames = new ArrayList<>();
        for (Product product : products) {
            productNames.add(product.getProductName());
        }
        return productNames;
    }
}
