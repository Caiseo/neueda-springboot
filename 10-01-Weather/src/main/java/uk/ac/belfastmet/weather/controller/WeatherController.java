package uk.ac.belfastmet.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	
	private TodaysWeather todaysWeather;
	
	@GetMapping("")
	@ResponseBody
	public TodaysWeather home(Model model) {
		
		model.addAttribute("pageTitle", "Weather");
		RestTemplate restTemplate = new RestTemplate();
		this.weatherService = new WeatherService(null);
		this.todaysWeather = weatherService.getTodaysWeather();
		return this.todaysWeather;
	}

	public WeatherController(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}
		
}
