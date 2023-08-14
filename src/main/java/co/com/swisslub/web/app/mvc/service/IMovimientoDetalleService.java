/**
 * 
 */
package co.com.swisslub.web.app.mvc.service;

import java.util.List;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;

/**
 * @author INGENIERO JAVIER
 *
 */
public interface IMovimientoDetalleService {
	public  MovimientoDetalle crear(MovimientoDetalle movimientoDetalle);
	public  void crearDetalles(List<MovimientoDetalle> lista);
	public  MovimientoDetalle editar(MovimientoDetalle movimientoDetalle);
	public  List<MovimientoDetalle> listar();
	public  MovimientoDetalle buscarId(Integer id);
	public  MovimientoDetalle buscarMovimiento(Integer id);
	public  void eliminar(Integer id);
}
