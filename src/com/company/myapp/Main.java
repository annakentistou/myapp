package com.company.myapp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
     /*   UI ui = new UI();
        Basket basket = new Basket();
        ui.manageBasket(basket);*/

        CustomerID customerID = new CustomerID();
        CustomersList customerslist = new CustomersList();
        customerID.manageCustList(customerslist);

        //method invocation, or method call, method usage

        /*float total = calc(50,4.5f);
        System.out.println("Total price of products is : " + total);*/

       // Product product;
        //create new object
        //product = new Product("C1", "Apples", 1.5f, 10);
        /*System.out.println("The code of product is: " +product.getCode()
                            +" The name of product is:"+product.getName()
                            +" The price of product is: "+product.getPrice());*/
        //System.out.println(product.toString());

        //Create second object
        //Product AnotherProduct = new Product("C2", "Mellon", 1.8f, 5);
        /*System.out.println("The code of product is: " +AnotherProduct.getCode());
        System.out.println("The name of product is: " +AnotherProduct.getName());*/
        //System.out.println("Another " + AnotherProduct.toString());

       /* Basket basket = new Basket();
        basket.addProduct(product);
        basket.addProduct(AnotherProduct);

        System.out.println("Total cost is : " + basket.getTotalCost());
        basket.displayProducts();
        basket.removeProduct(0);
        basket.clearProducts();*/


        //Object "product" uses second constructor, destroy previous object???
        /*product = new Product("A2","WaterMellon");
        System.out.println("The new code of product is: "+product.getCode()
                            +" The new name of product is: "+product.getName());*/

        /*ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(AnotherProduct);*/


        //Calculate Total price of products
      /*  float totalPrice = 0;
        for (Product cost : products) {
            totalPrice += cost.getPrice() * cost.getQuantity();
        }
        System.out.println("Total price of products is :" +totalPrice);
*/
        //1st method to print Arraylist
        /*for (Product aProduct : products) {
            System.out.println(aProduct.toString());
        }*/

   /*     //Another method to print arraylist
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ") " + products.get(i));
        }

        //check only memory
        if (product == AnotherProduct) {
            System.out.println("They are equals!");
        } else {
            System.out.println("They aren't equals!");
        }

        //check memory and content of objects
        if (product.equals(AnotherProduct)) {
            System.out.println("They are equivalents!");
        } else {
            System.out.println("They aren't equivalents!");
        }*/

        //All about Costumers
      /*  Customer customer = new Customer("Anna",
                "Smith",
                "Tropaia",
                "smith@gmail.com",
                6977777777L);
        System.out.println(customer.toString());*/


        //run-time error checking example
      /*  try {
            System.out.println(products.get(3));
        }
        catch (Exception exception) {
            System.out.println("Error: This product doesn't exist!");
        }*/
    }
    //method declaration or method definition
   /* public static float calc(int quantity, float price) {
        float total = price * quantity;
        return total;
    }*/
}
