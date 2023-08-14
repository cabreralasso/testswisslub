/**
 * 
 */
package co.com.swisslub.web.app.mvc.service;

import java.util.List;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.MovimientoEstado;

/**
 * @author INGENIERO JAVIER
 *
 */
public interface IMovimientoService {

	public  Movimiento crear(Movimiento movimiento);
	public  Movimiento editar(Movimiento movimiento);
	public  List<Movimiento> listar();
	public  Movimiento buscarId(Integer id);
	public  List<Movimiento> buscarEstado(Integer id);
	public  void eliminar(Integer id);
	
}
