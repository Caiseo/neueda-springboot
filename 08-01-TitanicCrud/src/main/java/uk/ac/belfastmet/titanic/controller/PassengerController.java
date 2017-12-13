package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;


@Controller
@RequestMapping("/")

public class PassengerController {

	@Autowired
	PassengerRepository titanicRepository;

	public PassengerController(PassengerRepository titanicRepository) {
		super();
		this.titanicRepository = titanicRepository;
	}

	@GetMapping("/passengersPage")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Passengers!");
		model.addAttribute("passengers", titanicRepository.findAll());
		return ("passengersPage");
	}
}