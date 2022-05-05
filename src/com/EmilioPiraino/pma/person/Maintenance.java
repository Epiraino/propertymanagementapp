package com.EmilioPiraino.pma.person;

public class Maintenance extends Person {
    private boolean isActive;

    public Maintenance(String name, String dateOfBirth, String phoneNumber, String emailAddress, boolean isActive) {
        super(name, dateOfBirth, phoneNumber, emailAddress);
        this.isActive = isActive;
    }

    public Maintenance(String name, String dateOfBirth, String phoneNumber, boolean isActive) {
        super(name, dateOfBirth, phoneNumber);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "isActive=" + isActive +
                '}';
    }
}
