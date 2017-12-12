package uk.ac.belfastmet.breakfastcereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {

}
