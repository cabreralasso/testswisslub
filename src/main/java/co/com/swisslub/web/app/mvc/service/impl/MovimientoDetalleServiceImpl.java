package co.com.swisslub.web.app.mvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.swisslub.web.app.mvc.model.Empresa;
import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;
import co.com.swisslub.web.app.mvc.repository.EmpresaRepository;
import co.com.swisslub.web.app.mvc.repository.MovimientoDetalleRepository;
import co.com.swisslub.web.app.mvc.service.IEmpresaService;
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

		if(movimientoDetalle.getMovimiento()==null) {
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
			 MovimientoDetalle movimientoTem= buscarId(movimientoDetalle.getId());
			 if(movimientoTem!=null) {
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
	public MovimientoDetalle buscarId(Integer id) {
		Optional<MovimientoDetalle> optional = Optional.of(repository.getById(id));
		MovimientoDetalle movimientoDetalle = null;
		if (optional.isPresent()) {
			movimientoDetalle = optional.get();
		}
		return movimientoDetalle;
	}

	@Override
	public MovimientoDetalle buscarMovimiento(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearDetalles(List<MovimientoDetalle> lista) {
		repository.saveAll(lista);

	}
	
	
}
