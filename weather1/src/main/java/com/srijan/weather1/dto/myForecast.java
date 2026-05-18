package com.srijan.weather1.dto;

import java.util.List;

public class myForecast {
    private WetherResponce wetherResponce;
    private List<daystemp> daystemp;

    public myForecast() {
    }

    public myForecast(WetherResponce wetherResponce, List<daystemp> daystemp) {
        this.wetherResponce = wetherResponce;
        this.daystemp = daystemp;
    }

    public List<daystemp> getDaystemp() {
        return daystemp;
    }

    public void setDaystemp(List<daystemp> daystemp) {
        this.daystemp = daystemp;
    }

    public WetherResponce getWetherResponce() {
        return wetherResponce;
    }

    public void setWetherResponce(WetherResponce wetherResponce) {
        this.wetherResponce = wetherResponce;
    }


}
