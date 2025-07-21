package com.xworkz.map.runner;

import com.xworkz.map.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRunner {

    public static void main(String[] args) {

        List<ProductDTO> productDTOS = new ArrayList<>();
        productDTOS.add(new ProductDTO("soap",25));
        productDTOS.add(new ProductDTO("top",250));
        productDTOS.add(new ProductDTO("pant",550));
        productDTOS.add(new ProductDTO("toothpaste",50));

        productDTOS.forEach(e-> System.out.println(e));

        System.out.println("---------------------------------------------------------------------");

        Collections.sort(productDTOS);

        productDTOS.forEach(e-> System.out.println(e));

    }
}
