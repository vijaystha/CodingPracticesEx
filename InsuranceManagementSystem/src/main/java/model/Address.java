package model;

public class Address {
    private String buildingNumber;
    private String streetName;
    private String state;
    private String zipCode;
    private String city;
    private String country;

    public Address(String buildingNumber, String streetName, String state, String zipCode, String city, String country) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.state = state;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    }
