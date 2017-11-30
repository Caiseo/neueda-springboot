package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;

@Controller
@RequestMapping("/")

public class LargestUsableVolumeController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("/LargestUsableVolume")
	public String LargestUsableVolume(Model model) {
		model.addAttribute("pageTitle", "Largest Usable Volume!");
		this.buildingService = new BuildingService();
		model.addAttribute("LargestUsableVolume", this.buildingService.getLargestUsableVolume());
		return "LargestUsableVolume";

	}
}
