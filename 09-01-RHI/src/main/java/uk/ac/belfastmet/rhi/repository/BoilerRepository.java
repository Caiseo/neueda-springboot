package uk.ac.belfastmet.rhi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.rhi.domain.Rhi;

public interface BoilerRepository extends CrudRepository<Rhi, Integer> {
}