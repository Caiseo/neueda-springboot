package uk.ac.belfastmet.rhi.controller;


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

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repository.BoilerRepository;

@Controller
@RequestMapping("/")

public class HomeController {



	@Autowired
	BoilerRepository boilerRepository;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home");
		// model.addAttribute("cereals", boilerRepository.findAll());
		return "homePage";

	}

	@GetMapping("/Boilerpage")
	public String passenger(Model model) {
		model.addAttribute("pageTitle", "Boilers!");
		model.addAttribute("boiler", boilerRepository.findAll());
		return ("Boilerpage");
		
	}
	
	@GetMapping("/rhi/view/{boilerId}")
	public String viewBoiler(@PathVariable("boilerId")Integer boilerId, Model model) {
		model.addAttribute("pageTitle", "View Boilers");
		model.addAttribute("boiler", boilerRepository.findOne(boilerId));
		return "viewBoiler";

	}

	@GetMapping("/rhi/edit/{boilerId}")
	public String editBoiler(@PathVariable("boilerId") Integer boilerId, Model model) {

		model.addAttribute("pageTitle", "Edit Boiler");
		model.addAttribute("rhi", boilerRepository.findOne(boilerId));
		return "editBoiler";

	}

	@GetMapping("/rhi/delete/{boilerId}")
	public String deleteBoiler(@PathVariable("boilerId") Integer boilerId, 
			RedirectAttributes redirectAttrs) {

		boilerRepository.delete(boilerId);
		redirectAttrs.addFlashAttribute("message", "Boiler was deleted");
		return "redirect:/viewBoiler";

	}

	@GetMapping("/titanic/add")
	public String createBoiler(Model model) {
		model.addAttribute("pageTitle", "Add Boiler");
		model.addAttribute("titanic", new Rhi());
		return "editBoiler";

	}
	

	@PostMapping("/titanic/save")
	public String saveBoiler(@Valid Rhi rhi, BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) {
			return "editBoiler";

		} else {

			Rhi savedBoiler = boilerRepository.save(rhi);
			return "redirect:/boiler/view/" + savedBoiler.getBoilerId();

		}	
	}
}



