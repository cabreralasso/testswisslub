package co.com.swisslub.web.app.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.swisslub.web.app.mvc.model.Empresa;
import co.com.swisslub.web.app.mvc.model.MovimientoEstado;
import co.com.swisslub.web.app.mvc.repository.EmpresaRepository;
import co.com.swisslub.web.app.mvc.repository.MovimientoEstadoRepository;
import co.com.swisslub.web.app.mvc.service.IEmpresaService;
import co.com.swisslub.web.app.mvc.service.IMovimientoEstadoService;
import co.com.swisslub.web.app.mvc.service.IMovimientoService;

@Service
public class MovimientoEstadoServiceImpl implements IMovimientoEstadoService{

	@Autowired
	private MovimientoEstadoRepository repository;
	
	@Override
	public List<MovimientoEstado> lista() {
		Optional<List<MovimientoEstado>> optional = Optional.of(repository.findAll());
		List<MovimientoEstado>lista= null;
		if(optional.isPresent()) {
			lista=optional.get();
			
		}
		return lista;
	}

}
