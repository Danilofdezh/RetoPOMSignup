package com.phptravels.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String firstName, lastName, mobileNumber, email, password, account_type;

    public String getFirstName() {

        return firstName; }

    public String getLastName() {

        return lastName;
    }
    public String getMobileNumber() {

        return mobileNumber;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {

        return password;
    }

    public String getAccount_type() {

        return account_type; }


    public DataInjection(){
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.mobileNumber = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.email = "danilofdez20@gmail.com";
        this.password = "12345678";
        this.account_type = "Customer";


    }
}
