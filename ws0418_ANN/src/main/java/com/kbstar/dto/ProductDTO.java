package com.kbstar.dto;

public class ProductDTO {
    private String name;
    private int price;
    private int qty;

    public ProductDTO(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public ProductDTO() {
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
