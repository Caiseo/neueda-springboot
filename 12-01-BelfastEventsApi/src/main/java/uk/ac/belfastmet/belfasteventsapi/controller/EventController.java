package uk.ac.belfastmet.belfasteventsapi.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belfasteventsapi.domain.AllEvents;
import uk.ac.belfastmet.belfasteventsapi.domain.Event;

@Controller
@RequestMapping("/")

public class EventController {

	@GetMapping ("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "HomePage");
		return ("homePage");
	}

	@GetMapping("/allEvents")
	public String event(Model model) {

		model.addAttribute("pageTitle", "All Events");

		String belfastEventsUrl="http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";

		RestTemplate restTemplate = new RestTemplate();
		AllEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);


		model.addAttribute("event", belfastEvents.getAllEvents());

		return "allEvents";

	}

	@GetMapping("/showEvents/{eventId}")

	public String event (Model model, @PathVariable("eventId") String eventId) {
		
		model.addAttribute("pageTitle", "showEvents");
		
		String belfastEventsUrl="http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		ArrayList<Event> eventsArray = belfastEvents.getAllEvents(); 
		
		Event requestedEvent = new Event();
		
		for(Event currentEvent: eventsArray)
		{
			if (currentEvent.getIdentifier().equals(eventId))
			{
				requestedEvent = currentEvent;
			}

		}
		model.addAttribute("event", requestedEvent);
		
		return "showEvent";
			
		}
	}


