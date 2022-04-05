package com.tts.WeatherApp;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private String apiKey;

    public WeatherService(String apiKey) {
        this.apiKey = apiKey;
    }

    public Response getForecast(String zipCode){
        String url= "http://api.openweathermap.org/data/2.5/weather?zip=4775b76048cf040afcaac5878fa69300" +
                zipCode + "&units=imperial&appId=4775b76048cf040afcaac5878fa69300" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }

}