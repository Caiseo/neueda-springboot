package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
//import uk.ac.belfastmet.dwarfs.service.DwarfService;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Controller
@RequestMapping("/")
public class TolkienController {

	@Autowired
	DwarfRepository dwarfRepository;

	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	// @Autowired
	// private DwarfService dwarfService;

	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien!");
		// this.dwarfService = new DwarfService();
		model.addAttribute("dwarves", dwarfRepository.findByAuthor("Tolkien"));
		return "tolkienpage";
	}

}
