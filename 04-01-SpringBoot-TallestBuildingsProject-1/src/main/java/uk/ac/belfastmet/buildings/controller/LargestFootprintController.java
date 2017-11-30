package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;

@Controller
@RequestMapping("/")

public class LargestFootprintController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("/LargestFootprint")
	public String LargestFootprint(Model model) {
		model.addAttribute("pageTitle", "Largest Footprint!");
		this.buildingService = new BuildingService();
		model.addAttribute("LargestFootprint", this.buildingService.getLargestFootprint());
		return "LargestFootprint";

	}
}
