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
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDTO;
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
			movimiento.setEstado("b");
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
			Optional<Movimiento> optional = Optional.of(repository.getById(movimiento.getId()));
			if (optional.isPresent()) {
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
	public MovimientoDTO buscarId(Integer id) {
		Optional<Movimiento> optional = Optional.of(repository.getById(id));
		MovimientoDTO movimiento = new MovimientoDTO();
		if (optional.isPresent()) {
			movimiento.setDescripcion(optional.get().getDescripcion());
			movimiento.setId(optional.get().getId());
			movimiento.setEmpresa(optional.get().getEmpresa().getNombre());
			movimiento.setBodegaOrigen(optional.get().getOrigen().getNombre());
			movimiento.setBodegaDestino(optional.get().getDestino().getNombre());
			movimiento.setFechaCreacion(optional.get().getCreacion());
			movimiento.setFechaEntrega(optional.get().getEntrega());
			movimiento.setEstado(optional.get().getEstado());
		}
		return movimiento;
	}

	@Override
	public List<Movimiento> buscarEstado(String id) {
		List<Movimiento> lista = repository.findByEstado(id);
		return lista;
	}

	@Override
	public String eliminar(Integer id) {
		Optional<Movimiento> optional = Optional.of(repository.getById(id));
		if (optional.isPresent()) {
			repository.deleteById(id);
			return "Movimiento eliminado..";
		}
		return "el movimiento no existe";
	}

}
