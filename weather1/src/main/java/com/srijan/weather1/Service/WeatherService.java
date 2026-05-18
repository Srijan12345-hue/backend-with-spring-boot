package com.srijan.weather1.Service;

import com.srijan.weather1.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String Apikey;

    @Value("${weather.api.url}")
    private String apiUrls;
    @Value("${weather.api.forecast.url}")
    private String apiforecast;
    private RestTemplate restTemplate= new RestTemplate();
    public WetherResponce getWeather(String s){
        String url =apiUrls  + "?key=" + Apikey + "&q=" + s;
       root responce= restTemplate.getForObject(url,root.class);
        WetherResponce wetherResponce= new WetherResponce();
        assert responce != null;
        wetherResponce.setCity( responce.getLocation().name);
        wetherResponce.setRegion( responce.getLocation().region);
        wetherResponce.setCountry( responce.getLocation().country);
        String condition= responce.getCurrent().getCondition().text;
        wetherResponce.setCondition(condition);
        wetherResponce.setTemperature(responce.getCurrent().getTemp_c());
        return wetherResponce;

    }

    public WeatherForecast getForcast  (String city, int days){

        WetherResponce wetherResponce=  getWeather(city);



        WeatherForecast responce= new WeatherForecast();
        responce.setWeatherResponse(wetherResponce);
        List<daystemp> dayList = new ArrayList<>();
        String url= apiforecast +"?key="+Apikey +"&q="+city +"&days=" + days;
        root apiForcastresponce=restTemplate.getForObject(url, root.class) ;
        if (apiForcastresponce == null || apiForcastresponce.getForecast() == null) {
            throw new IllegalStateException("Forecast response is empty for city: " + city);
        }
        Forecast forcast=apiForcastresponce.getForecast();
        ArrayList<ForcastDay> forcastDays=forcast.getForecastday();
        if (forcastDays == null) {
            throw new IllegalStateException("Forecast days are missing for city: " + city);
        }
        for(ForcastDay day: forcastDays){
            daystemp d=new daystemp();
            d.setDate(day.getDate());
            d.setMinTemp(day.getDay().mintemp_c);
            d.setAvgTemp(day.getDay().avgtemp_c);
            d.setMaxTemp(day.getDay().maxtemp_c);
            dayList.add(d);
        }
        responce.setDayTemp(dayList);
        return responce;
    }
}
