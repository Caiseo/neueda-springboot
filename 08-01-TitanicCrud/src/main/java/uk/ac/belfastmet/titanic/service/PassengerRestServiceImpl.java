package uk.ac.belfastmet.titanic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.titanic.domain.Titanic;
import uk.ac.belfastmet.titanic.repository.PassengerRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService {

	@Autowired
	private PassengerRepository passengerRepository;
	
	
	public PassengerRestServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Iterable<Titanic> list() {
		
		return this.passengerRepository.findAll();
	}

	@Override
	public Titanic create(Titanic titanic) {
		
		return this.passengerRepository.save(titanic);
	}

	@Override
	public Titanic read(Integer passengerId) {

		return this.passengerRepository.findOne(passengerId);
	}

	@Override
	public Titanic update(Integer passengerId, Titanic titanic) {

		Titanic titanicToUpdate = this.passengerRepository.findOne(passengerId);
		return passengerRepository.save(titanicToUpdate);
	}

	@Override
	public void delete(Integer passengerId) {
		this.passengerRepository.delete(passengerId);

	}

}
