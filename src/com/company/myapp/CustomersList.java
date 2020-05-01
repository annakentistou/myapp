package com.company.myapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomersList {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        customers.forEach(System.out::println);
    }

    public void removeCustomerFromList(int index) {

        if (index < 0 && index < customers.size()) {
            customers.remove(index);
        }
    }

    public void clearCustList() {

        customers.clear();
    }

    public void saveCustList(String filename) {
        try {
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Customer c : customers) {
                printWriter.println(c.getSurname() + ", " + c.getName() + ", " + c.getAddress() + ", " + c.getEmail() + ", " + c.getTel());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
        }

    }

    public void loadCustList(String filename) {
        customers.clear();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Customer customer = new Customer(words[0],
                        words[1],
                        words[2],
                        words[3],
                        Long.parseLong(words[4]));
                customers.add(customer);

            }
        } catch (Exception e) {

        }
    }

}

