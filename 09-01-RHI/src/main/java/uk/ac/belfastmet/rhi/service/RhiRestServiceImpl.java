package uk.ac.belfastmet.rhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.rhi.domain.Rhi;
import uk.ac.belfastmet.rhi.repository.BoilerRepository;

@Service
public class RhiRestServiceImpl implements RhiRestService {

	@Autowired
	private BoilerRepository boilerRepository;
	
	
	public RhiRestServiceImpl(BoilerRepository boilerRepository) {
		super();
		this.boilerRepository = boilerRepository;
	}

	@Override
	public Iterable<Rhi> list() {
		
		return this.boilerRepository.findAll();
	}

	@Override
	public Rhi create(Rhi rhi) {
		
		return this.boilerRepository.save(rhi);
	}

	@Override
	public Rhi read(Integer boilerId) {

		return this.boilerRepository.findOne(boilerId);
	}

	@Override
	public Rhi update(Integer boilerId, Rhi rhi) {

		Rhi rhiToUpdate = this.boilerRepository.findOne(boilerId);
		return boilerRepository.save(rhiToUpdate);
	}

	@Override
	public void delete(Integer boilerId) {
		this.boilerRepository.delete(boilerId);

	}

}
