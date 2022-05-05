package com.EmilioPiraino.pma.person;

public class Tenant extends Person {

    private String streetAddress;
    private int unitNumber;
    private String city;
    private String state;
    private String zipCode;
    private double rentAmount;
    private boolean isDelinquent = false;

    public Tenant(String name, String dateOfBirth, String phoneNumber, String emailAddress, String streetAddress, int unitNumber, String city, String state, String zipCode, double rentAmount) {
        super(name, dateOfBirth, phoneNumber, emailAddress);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.rentAmount = rentAmount;
    }

    public Tenant(String name, String dateOfBirth, String phoneNumber, String streetAddress, int unitNumber, String city, String state, String zipCode, double rentAmount) {
        super(name, dateOfBirth, phoneNumber);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.rentAmount = rentAmount;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public boolean isDelinquent() {
        return isDelinquent;
    }

    public void setDelinquent(boolean delinquent) {
        isDelinquent = delinquent;
    }
}
