package com.company.myapp;

public class Customer {
    private String name;
    private String surname;
    private String address;
    private String email;
    private long tel;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public long getTel() {

        return tel;
    }

    public void setTel(long tel) {

        this.tel = tel;
    }
    //set a complete constructor
    public Customer(String name, String surname, String address, String email, long tel) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.tel = tel;
    }
    //set an empty constructor
    public Customer() {
        name = "N.A.";
        surname = "N.A.";
        address = "N.A.";
        email = "N.A.";
    }

    //create a toString method
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tel=" + tel +
                '}';
    }
}
