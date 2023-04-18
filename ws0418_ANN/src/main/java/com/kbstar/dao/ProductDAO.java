package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDAO implements MyDAO<String, ProductDTO> {

    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle: " + productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted Oracle: " + s);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO productDTO = new ProductDTO(s, 4000, 100);
        System.out.println("Selected Oracle: " + s);
        return productDTO;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> productList = new ArrayList<>();
        productList.add(new ProductDTO("맥북", 2000, 10));
        productList.add(new ProductDTO("에어팟", 3000, 20));
        productList.add(new ProductDTO("키보드", 4000, 30));
        return productList;
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle: " + productDTO);
    }
}
