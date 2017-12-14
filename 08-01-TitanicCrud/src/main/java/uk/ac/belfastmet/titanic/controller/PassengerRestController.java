package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.service.PassengerRestService;

@RestController
@RequestMapping("/api/passenger")
public class PassengerRestController {

	@Autowired
	PassengerRestService passengerRestService;


	public PassengerRestController(PassengerRestService passengerRestService) {
		super();
		this.passengerRestService = passengerRestService;
	}


	@GetMapping("/")
	public Iterable<Titanic>list(){
		return passengerRestService.list();
	}

	@PostMapping("/")
	public Titanic create(@RequestBody Titanic titanic){
		return passengerRestService.create(titanic);
		
	}

	@GetMapping("/{passengerId}")
	public Titanic read(@PathVariable("passengerId")Integer passengerId){
		return passengerRestService.read(passengerId);
	}

	@DeleteMapping("/{passengerId}")
	public void delete(@PathVariable("passengerId")Integer passengerId){
		passengerRestService.delete(passengerId);
	}

	

	}
