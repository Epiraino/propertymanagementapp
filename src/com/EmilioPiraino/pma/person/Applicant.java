package com.EmilioPiraino.pma.person;

public class Applicant extends Person{

    private String streetAddress;
    private int unitNumber;
    private String city;
    private String state;
    private String zipCode;
    private String referringAgency;
    private boolean isApproved;

    public Applicant(String name, String dateOfBirth, String phoneNumber, String emailAddress, String streetAddress, int unitNumber, String city, String state, String zipCode) {
        super(name, dateOfBirth, phoneNumber, emailAddress);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Applicant(String name, String dateOfBirth, String phoneNumber, String streetAddress, int unitNumber, String city, String state, String zipCode) {
        super(name, dateOfBirth, phoneNumber);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Applicant(String name, String dateOfBirth, String phoneNumber, String emailAddress, String streetAddress, int unitNumber, String city, String state, String zipCode, String referringAgency) {
        super(name, dateOfBirth, phoneNumber, emailAddress);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.referringAgency = referringAgency;
    }

    public Applicant(String name, String dateOfBirth, String phoneNumber, String streetAddress, int unitNumber, String city, String state, String zipCode, String referringAgency) {
        super(name, dateOfBirth, phoneNumber);
        this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.referringAgency = referringAgency;
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

    public String getReferringAgency() {
        return referringAgency;
    }

    public void setReferringAgency(String referringAgency) {
        this.referringAgency = referringAgency;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}
