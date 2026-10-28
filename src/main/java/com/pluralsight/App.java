package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Product product1 = new Product(10, "hammer", 2.99);
        Product product2 = new Product(20, "pickaxe", 2.99);
        Product product3 = new Product( 30, "sword", 2.99);
        Product product4 = new Product(40, "grass", 2.99);
        Product product5 = new Product(50, "sheep", 2.99);

        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);
        inventory.add(product5);

        inventory.add(new Product(60, "pig", 2.99 ));

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d Name: %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
// this method loads product objects into inventory
// and its details are not shown
        return inventory;
    }
}
