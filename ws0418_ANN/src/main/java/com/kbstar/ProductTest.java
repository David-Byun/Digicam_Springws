package com.kbstar;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>) factory.getBean("pservice");

        ProductDTO product = new ProductDTO("Amazon", 300, 20);
        service.register(product);
        service.modify(product);
        service.remove(product.getName());
        service.get(product.getName());
        service.get();
    }
}