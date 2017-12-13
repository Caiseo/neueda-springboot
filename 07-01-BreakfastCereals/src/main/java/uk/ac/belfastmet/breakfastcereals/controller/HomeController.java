package uk.ac.belfastmet.breakfastcereals.controller;

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

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;
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
	@GetMapping("/cereal/view/{cerealId}")
	public String viewCereal(@PathVariable("cerealId")Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "viewCereal";

	}
	
	@GetMapping("/cereal/edit/{cerealId}")
	public String editCereal(@PathVariable("cerealId") Integer cerealId, Model model) {
		
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "editCereal";
}
	
	@GetMapping("/cereal/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId") Integer cerealId, 
			RedirectAttributes redirectAttrs) {
		
		cerealRepository.delete(cerealId);
		redirectAttrs.addFlashAttribute("message", "Cereal was deleted");
		return "redirect:/";
		
	}

	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCereal";

	}
	
	
	@PostMapping("/cereal/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) {
			return "editCereal";

		} else {

			Cereal savedCereal = cerealRepository.save(cereal);
			return "redirect:/cereal/view/" + savedCereal.getCerealId();

		}

	}	


}
