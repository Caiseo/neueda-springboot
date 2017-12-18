package uk.ac.belfastmet.weather.service;

import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;

public class WeatherService {
	
	
	private String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
	private String dublinWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
	private String londonWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
	
	private RestTemplate restTemplate;
	
	public WeatherService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public TodaysWeather getTodaysWeather() {
		String todaysWeatherUrl = this.belfastWeatherUrl;
		
		TodaysWeather todaysWeather = restTemplate.getForObject(todaysWeatherUrl, TodaysWeather.class);
		
		return todaysWeather;
	}
}
