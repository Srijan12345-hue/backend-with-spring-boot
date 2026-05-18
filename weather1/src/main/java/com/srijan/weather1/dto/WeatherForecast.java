package com.srijan.weather1.dto;

import java.util.List;

public class WeatherForecast {
    private WetherResponce weatherResponse;
    private List<daystemp> dayTemp;



    public WetherResponce getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse( WetherResponce weatherResponse) {
        this.weatherResponse = weatherResponse;
    }

    public List<daystemp> getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(List<daystemp> dayTemp) {
        this.dayTemp = dayTemp;
    }
}

