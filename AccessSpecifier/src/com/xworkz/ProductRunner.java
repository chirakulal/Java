package com.xworkz;

import com.xworkz.external.User;
import com.xworkz.internal.Product;
import com.xworkz.internal.Purchase;

public class ProductRunner {

    public static void main(String[] args) {
        Product product = new Product();

        Purchase purchase =new Purchase(product);
        purchase.details();

        User user = new User(product);
        user.buy();
    }
}
