package com.pm.productcatalogservice.repos;

import com.pm.productcatalogservice.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepoTest {
    @Autowired
    private ProductRepo productRepo;

    @Test
    public void testJpa(){
        List<Product> productList=productRepo.findProductByOrderByPrice();
        for(Product product:productList){
            System.out.println(product.getPrice());
        }
    }

    @Test
    public void testFindProductTitleByID(){
        String title=productRepo.findProductTitleByID(1L);
        System.out.println(title);
    }

    @Test
    public void testFindCategoryNameFromProductId(){
        String categoryName=productRepo.findCategoryNameFromProductId(1L);
        System.out.println(categoryName);
    }




}