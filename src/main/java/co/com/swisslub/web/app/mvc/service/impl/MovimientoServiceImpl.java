/**
 * 
 */
package co.com.swisslub.web.app.mvc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.MovimientoEstado;
import co.com.swisslub.web.app.mvc.repository.MovimientoRepository;
import co.com.swisslub.web.app.mvc.service.IMovimientoService;

/**
 * @author INGENIERO JAVIER
 *
 */
@Service
public class MovimientoServiceImpl implements IMovimientoService {

	@Autowired
	private MovimientoRepository repository;

	@Override
	public Movimiento crear(Movimiento movimiento) {
		if (validaInformacion(movimiento)) {
			movimiento.setEstado(new MovimientoEstado(1));
			movimiento.setCreacion(new Date());
			repository.save(movimiento);
		}
		return movimiento;
	}

	private boolean validaInformacion(Movimiento movimiento) {
		if (movimiento.getEmpresa() == null) {
			return false;
		}
		if (movimiento.getDescripcion() == null) {
			return false;
		}
		if (movimiento.getOrigen() == null) {
			return false;
		}
		if (movimiento.getDestino() == null) {
			return false;
		}
		if (movimiento.getEntrega() == null) {
			return false;
		} else {

		}

		return true;
	}

	@Override
	public Movimiento editar(Movimiento movimiento) {
		if (validaInformacion(movimiento)) {
			 Movimiento movimientoTem= buscarId(movimiento.getId());
			 if(movimientoTem!=null) {
				 repository.save(movimiento);	 
			 }			
		}
		return movimiento;
	
	}

	@Override
	public List<Movimiento> listar() {
		return repository.findAll();
	}

	@Override
	public Movimiento buscarId(Integer id) {
		Optional<Movimiento> optional = Optional.of(repository.getById(id));
		Movimiento movimiento = null;
		if (optional.isPresent()) {
			movimiento = optional.get();
		}
		return movimiento;
	}

	@Override
	public List<Movimiento> buscarEstado(Integer id) {
		List<Movimiento> lista = repository.findById_estado(id);
		return lista;
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

}
