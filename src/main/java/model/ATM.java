package model;

import java.sql.Timestamp;

public class ATM {

    private int atmId;
    private String location;
    private String city;
    private String status;
    private String currency;
    private double cashAvailable;
    private Timestamp lastMaintenance;

    public ATM(int atmId, String location, String city, String status,
            String currency, double cashAvailable, Timestamp lastMaintenance) {
        this.atmId = atmId;
        this.location = location;
        this.city = city;
        this.status = status;
        this.currency = currency;
        this.cashAvailable = cashAvailable;
        this.lastMaintenance = lastMaintenance;
    }

    // Getters and Setters
    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public Timestamp getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(Timestamp lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }
}
