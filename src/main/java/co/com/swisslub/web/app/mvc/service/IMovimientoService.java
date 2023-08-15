/**
 * 
 */
package co.com.swisslub.web.app.mvc.service;

import java.util.List;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDTO;

/**
 * @author INGENIERO JAVIER
 *
 */
public interface IMovimientoService {

	public  Movimiento crear(Movimiento movimiento);
	public  Movimiento editar(Movimiento movimiento);
	public  List<Movimiento> listar();
	public  MovimientoDTO buscarId(Integer id);
	public  List<Movimiento> buscarEstado(String estado);
	public  String eliminar(Integer id);
	
}
