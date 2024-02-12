package com.adpc.features.customer.domain;

public class Customer {

    private final String dni;
    private final String name;
    private final String surname;
    private final String population;
    private final String address;
    private final String postalCode;

    public Customer(String dni, String name, String surname, String population, String address, String postalCode) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.population = population;
        this.address = address;
        this.postalCode = postalCode;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPopulation() {
        return population;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

}
