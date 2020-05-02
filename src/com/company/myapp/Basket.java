package com.company.myapp;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        /*for (Product p : products){
            System.out.println(p);
        }*/

        //Simple method
        //System.out.println(products);

        //printing using Lamda Calculus
        //products.forEach(product -> System.out.println(product));

        //more modern method
        products.forEach(System.out::println);
    }

    public void removeProduct(int index) {
        //defensive programming
        if (index >=0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void clearProducts() {
        products.clear();
    }

    public float getTotalCost() {

        float totalProductsPrice;
        //1st Method
         /*totalProductsPrice=0;
        for (int i=0; i< products.size();i++){
            totalProductsPrice += products.get(i).getPrice() * products.get(i).getQuantity();
        }*/

        //2nd Method
       /*totalProductsPrice=0;
        for (Product p : products) {
            totalProductsPrice += p.getPrice() * p.getQuantity();
        }*/

        //3rd Method use Lamda Calculus
        totalProductsPrice = products.stream()
                .map(p -> p.getPrice() * p.getQuantity())
                .reduce(0.0f, (a, b) -> a + b);

        return totalProductsPrice;
    }

    public void saveBasket(String filename){
        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for(Product p : products) {
                printWriter.println("Product code: "+p.getCode()
                        +", " +" Product name: " + p.getName()
                        + ", " +"Product Price: "+ p.getPrice()
                        + ", " +"Quantity: " + p.getQuantity());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
                System.out.println("The file cannot be saved");
        }

    }
    public void loadBasket(String filename){
        //clear basket before loading
        products.clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine(); //read a row
                String[] words = line.split(", ");
                Product product = new Product(words[0],
                        words[1],
                        Float.parseFloat(words[2]),
                        Integer.parseInt(words[3]));
                products.add(product);

            }
        } catch (Exception e) {

        }
    }

}
