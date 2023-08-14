package co.com.swisslub.web.app.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.swisslub.web.app.mvc.model.Empresa;
import co.com.swisslub.web.app.mvc.repository.EmpresaRepository;
import co.com.swisslub.web.app.mvc.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public List<Empresa> lista() {
		Optional<List<Empresa>> optional = Optional.of(repository.findAll());
		List<Empresa>lista= null;
		if(optional.isPresent()) {
			lista=optional.get();
			
		}
		return lista;
	}

}
