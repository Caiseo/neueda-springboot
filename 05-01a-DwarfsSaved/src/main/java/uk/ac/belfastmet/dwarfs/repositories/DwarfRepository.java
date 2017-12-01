package uk.ac.belfastmet.dwarfs.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findByAuthor(String string);

	// Dwarf findByName(String string);

	Iterable<Dwarf> findByAuthorOrderByName(String string);

	Iterable <Dwarf> findByOrderByName();

	
	

	

}
