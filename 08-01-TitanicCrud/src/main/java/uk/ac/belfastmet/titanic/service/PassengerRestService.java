package uk.ac.belfastmet.titanic.service;

import uk.ac.belfastmet.titanic.domain.Titanic;

public interface PassengerRestService {

	Iterable<Titanic> list();
	
	Titanic create (Titanic titanic);
	
	Titanic read (Integer passengerId);
	
	Titanic update (Integer passengerId, Titanic titanic);
	
	void delete(Integer passengerId);
}
