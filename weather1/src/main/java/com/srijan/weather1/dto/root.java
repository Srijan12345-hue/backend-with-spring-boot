package com.srijan.weather1.dto;

public class root {
    public location location;
    public current current;
    public Forecast Forecast;


    public Forecast getForecast() {
        return Forecast;
    }

    public void setForecast(Forecast forecast) {
        Forecast = forecast;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public current getCurrent() {
        return current;
    }

    public void setCurrent(current current) {
        this.current = current;
    }
}
