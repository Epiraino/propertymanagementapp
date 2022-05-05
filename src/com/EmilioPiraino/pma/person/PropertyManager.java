package com.EmilioPiraino.pma.person;

public class PropertyManager extends Person {

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private boolean isActive;

    public PropertyManager(String name, String dateOfBirth, String phoneNumber, String emailAddress, String streetAddress, String city, String state, String zipCode, boolean isActive) {
        super(name, dateOfBirth, phoneNumber, emailAddress);
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isActive = isActive;
    }

    public PropertyManager(String name, String dateOfBirth, String phoneNumber, String streetAddress, String city, String state, String zipCode, boolean isActive) {
        super(name, dateOfBirth, phoneNumber);
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isActive = isActive;
    }


}
