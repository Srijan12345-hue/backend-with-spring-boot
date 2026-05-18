package com.srijan.weather1.dto;

import java.util.ArrayList;

public class Forecast {
    public WetherResponce wetherResponce;
    public ArrayList<ForcastDay> forecastday;

    public ArrayList<ForcastDay> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<ForcastDay> forecastday) {
        this.forecastday = forecastday;
    }

    public WetherResponce getWetherResponce() {
        return wetherResponce;
    }

    public void setWetherResponce(WetherResponce wetherResponce) {
        this.wetherResponce = wetherResponce;
    }
}
