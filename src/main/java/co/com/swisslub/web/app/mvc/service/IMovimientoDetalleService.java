/**
 * 
 */
package co.com.swisslub.web.app.mvc.service;

import java.util.List;

import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDetalleDTO;

/**
 * @author INGENIERO JAVIER
 *
 */
public interface IMovimientoDetalleService {
	public  MovimientoDetalle crear(MovimientoDetalle movimientoDetalle);
	public  void crearDetalles(List<MovimientoDetalle> lista);
	public  MovimientoDetalle editar(MovimientoDetalle movimientoDetalle);
	public  List<MovimientoDetalle> listar();
	public  MovimientoDetalleDTO buscarId(Integer id);
	public  List<MovimientoDetalle> buscarXestado(String estado);
	public  List<MovimientoDetalle> buscarMovimiento(Integer idMov);
	public  String eliminar(Integer id);
}
