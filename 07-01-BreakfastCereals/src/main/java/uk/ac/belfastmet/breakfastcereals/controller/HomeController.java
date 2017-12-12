package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;

@Controller
@RequestMapping("/")

public class HomeController {
	
	@Autowired
	CerealRepository cerealRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("cereals", cerealRepository.findAll());
		return "homePage";

}
}
