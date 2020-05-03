package com.company.myapp;

import java.util.Scanner;

public class CustomerID {
    public Choice menu() {
        Choice returnChoice;
        System.out.println("1. Add a Customer to list "
                + "2. Remove a Customer from list "
                + "3. Display Customers' List "
                + "4. Clear Customers' List "
                + "5. Save Customers' List "
                + "6. Load Customers' List "
                + "0. Exit");

        int choice;
        Scanner scanner = new Scanner(System.in);
        try{
            choice = scanner.nextInt();
            switch(choice){
                case 1: return Choice.ADD;
                case 2: return Choice.REMOVE;
                case 3: return Choice.DISPLAY;
                case 4: return Choice.CLEAR;
                case 5: return Choice.SAVE;
                case 6: return Choice.LOAD;
                case 0: return Choice.EXIT;
                default: return Choice.ERROR;
            }
        }
        catch (Exception e){
            return Choice.ERROR;
        }
    }

    //factory method design pattern
    public Customer createList(){
        String surname;
        String name;
        String address;
        String email;
        long tel;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your Surname");
        surname = scanner.next();
        System.out.println("Give your name");
        name = scanner.next();
        System.out.println("Give your address");
        address = scanner.next();
        System.out.println("Give your email");
        email = scanner.next();
        System.out.println("Give your phone number");
        tel = scanner.nextLong();

        Customer customer = new Customer(surname,name,address,email,tel);
        return customer;
    }

    public void manageCustList(CustomersList customerslist){
        Choice choice;
        do {
            choice = menu();

            switch (choice) {
                case ADD:
                    Customer customer = createList();
                    customerslist.addCustomer(customer);
                    break;
                case REMOVE:
                    System.out.println("Give an index to remove a product");
                    Scanner scanner = new Scanner(System.in);
                    int index = scanner.nextInt();
                    customerslist.removeCustomerFromList(index);
                    break;
                case DISPLAY:
                    customerslist.displayCustomers();
                    break;
                case CLEAR:
                    customerslist.clearCustList();
                    break;
                case SAVE:
                    customerslist.saveCustList("customers.txt");
                    break;
                case LOAD:
                    customerslist.loadCustList("customers.txt");
                    break;
                case EXIT:
                    break;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;
            }
        }while(choice!=Choice.EXIT);
    }

}
