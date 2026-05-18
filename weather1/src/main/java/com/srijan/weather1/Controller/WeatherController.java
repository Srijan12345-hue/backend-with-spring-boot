package com.srijan.weather1.Controller;

import com.srijan.weather1.Service.WeatherService;
import com.srijan.weather1.dto.WeatherForecast;
import com.srijan.weather1.dto.WetherResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
     private WeatherService weatherService;
    @GetMapping("/{city}")
    public WetherResponce getWeatherService(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
    @GetMapping("/forcast/{city}/{days}")
    public WeatherForecast getForecast(@PathVariable String city, @PathVariable int  days){
    return weatherService.getForcast(city,days);
    }
}
