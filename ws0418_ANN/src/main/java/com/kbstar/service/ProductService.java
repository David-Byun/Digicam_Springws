package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDAO;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pservice")
public class ProductService implements MyService<String, ProductDTO> {


    private final MyDAO dao;

    @Autowired
    public ProductService(MyDAO dao) {
        this.dao = dao;
    }

    @Override
    public void register(ProductDTO productDTO) {
        dao.insert(productDTO);
    }

    @Override
    public void remove(String s) {
        dao.delete(s);
    }

    @Override
    public ProductDTO get(String s) {
        ProductDTO getProduct = (ProductDTO) dao.select(s);
        return getProduct;
    }

    @Override
    public List<ProductDTO> get() {
        return null;
    }

    @Override
    public void modify(ProductDTO productDTO) {

    }
}
