package uk.ac.belfastmet.rhi.service;

import uk.ac.belfastmet.rhi.domain.Rhi;

public interface RhiRestService {

	Iterable<Rhi> list();
	
	Rhi create (Rhi rhi);
	
	Rhi read (Integer boilerId);
	
	Rhi update (Integer boilerId, Rhi rhi);
	
	void delete(Integer boilerId);
}
