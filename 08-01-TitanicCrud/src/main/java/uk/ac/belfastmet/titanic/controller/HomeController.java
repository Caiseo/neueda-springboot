package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Controller
@RequestMapping("/")

public class HomeController {

	@Autowired
	PassengerRepository passengerRepository;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("cereals", passengerRepository.findAll());
		return "homePage";

	}

	@GetMapping("/titanic/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId")Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "viewPassenger";

	}

	@GetMapping("/titanic/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("titanic", passengerRepository.findOne(passengerId));
		return "editPassenger";

	}

	@GetMapping("/titanic/delete/{passengerId}")
	public String deleteCereal(@PathVariable("passengerId") Integer passengerId, 
			RedirectAttributes redirectAttrs) {

		passengerRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger was deleted");
		return "redirect:/passengersPage";

	}

	@GetMapping("/titanic/add")
	public String createPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("titanic", new Titanic());
		return "editPassenger";

	}
	

	@PostMapping("/titanic/save")
	public String savePassenger(@Valid Titanic passenger, BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) {
			return "editPassenger";

		} else {

			Titanic savedPassenger = passengerRepository.save(passenger);
			return "redirect:/titanic/view/" + savedPassenger.getPassengerId();


		}	
	}
}



