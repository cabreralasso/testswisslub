package co.com.swisslub.web.app.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDetalleDTO;
import co.com.swisslub.web.app.mvc.repository.MovimientoDetalleRepository;
import co.com.swisslub.web.app.mvc.service.IMovimientoDetalleService;

@Service
public class MovimientoDetalleServiceImpl implements IMovimientoDetalleService {

	@Autowired
	private MovimientoDetalleRepository repository;

	@Override
	public MovimientoDetalle crear(MovimientoDetalle movimientoDetalle) {
		if (validaInformacion(movimientoDetalle)) {
			repository.save(movimientoDetalle);
		}
		return null;
	}

	private boolean validaInformacion(MovimientoDetalle movimientoDetalle) {

		if(movimientoDetalle.getId()==0) {
			return false;
		}
		if(movimientoDetalle.getCantidad()<1) {
			return false;
		}
		
		if(movimientoDetalle.getItem()==null) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public MovimientoDetalle editar(MovimientoDetalle movimientoDetalle) {
		if (validaInformacion(movimientoDetalle)) {
			 Optional<MovimientoDetalle> optional = Optional.of(repository.getById(movimientoDetalle.getId()));;
			 if(optional.isPresent()) {
				 repository.save(movimientoDetalle);	 
			 }			
		}
		return movimientoDetalle;
	
	}

	@Override
	public List<MovimientoDetalle> listar() {
		return repository.findAll();
	}

	@Override
	public MovimientoDetalleDTO buscarId(Integer id) {
		Optional<MovimientoDetalle> optional = Optional.of(repository.getById(id));
		MovimientoDetalleDTO movimientoDetalle = null;
		if (optional.isPresent()) {
			movimientoDetalle= new MovimientoDetalleDTO();
			movimientoDetalle.setId(optional.get().getId());
//			movimientoDetalle.setMovimientoDescripcion(optional.get().getMovimiento().getDescripcion());
			movimientoDetalle.setItem(optional.get().getItem());
			movimientoDetalle.setCantidad(optional.get().getCantidad());
		}
		return movimientoDetalle;
	}

	@Override
	public List<MovimientoDetalle> buscarXMovimiento(Integer id) {
		Optional<List<MovimientoDetalle>> optional = Optional.of(repository.findByidMov(id));
		List<MovimientoDetalle> lista= null;
		if (optional.isPresent()) {
			lista=optional.get();
		}
		return lista;
	}

	@Override
	public String eliminar(Integer id) {
		Optional<MovimientoDetalle> optional = Optional.of(repository.getById(id));
		if (optional.isPresent()) {
			repository.deleteById(id);
			return "Se eleimino el movimiento detalle";
		}
		return "no exixte el registro";
		
	}

	@Override
	public String crearListaDetalles(List<MovimientoDetalle> lista) {
		repository.saveAll(lista);

		return "Se ha guardado la lista";
	}



	@Override
	public List<MovimientoDetalle> buscarXestado(String estado) {
		
		return repository.findAll();
	}
	
	
}
