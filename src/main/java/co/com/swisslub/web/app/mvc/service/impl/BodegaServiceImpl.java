package co.com.swisslub.web.app.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.swisslub.web.app.mvc.model.Bodega;
import co.com.swisslub.web.app.mvc.repository.BodegaRepository;
import co.com.swisslub.web.app.mvc.service.IBodegaService;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private BodegaRepository repository;
	
	@Override
	public List<Bodega> lista() {
		Optional<List<Bodega>> optional = Optional.of(repository.findAll());
		List<Bodega>lista= null;
		if(optional.isPresent()) {
			lista=optional.get();
			
		}
		return lista;
	}

}
