package com.company.myapp;

import javax.swing.text.html.Option;
import java.util.*;

//Lamda tutorial
//Like basket class just for constructing
public class Aggregations {
    //abstract class, final = not new again , only once
    private final List<Product> products = new ArrayList<>();

    //expose list
    public List<Product> getProducts() {
        return products;
    }
    //increase product price kata rate = pososto
    public void applyIncreasePrice(float rate){
        products.forEach(p ->p.setPrice(p.getPrice() * (1+rate)));
    }

    //return the most expensive product in the list
    public Product getMostExpensiveProduct(){
        //class
        Optional<Product> productOptional =
                products.stream()
                .max(Comparator.comparingDouble(Product::getPrice));
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        else
            return null;
    }

    //return the less expensive product in the list
    public Product getLeastExpensiveProduct(){
        return  products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .get();
    }

    //return average of product price
    public float averagePrice(){
//      /* OptionalDouble average =
//                 products.stream()
//                .mapToDouble(p->p.getPrice())
//                .average();
//        return average.isPresent() ? (f*//*loat)average.getAsDouble():0;*/

        return products.stream()
                .map(p-> p.getPrice())
                .reduce(0.0f,(a,b)->a+b)/products.size();

       /* return (float) products.stream()
                .minToDouble(p->p.getPrice())
                .average().getDouble();*/

    }

}
