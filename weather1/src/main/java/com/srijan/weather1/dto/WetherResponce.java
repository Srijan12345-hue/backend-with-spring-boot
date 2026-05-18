package com.srijan.weather1.dto;

public class WetherResponce {
    private String City;
    private String region;
    private String country;
    private String Condition;
    private Double Temperature;

    public WetherResponce(String region, String city, String country, String condition, Double temperature) {
        this.region = region;
        City = city;
        this.country = country;
        Condition = condition;
         this.Temperature = temperature;
    }

    public WetherResponce() {
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public void setTemperature(Double temperature) {
        Temperature = temperature;
    }
}