package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanic.domain.Titanic;

public interface PassengerRepository extends CrudRepository<Titanic, Integer> {
}