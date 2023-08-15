/**
 * 
 */
package co.com.swisslub.web.app.mvc.model.DTO;

import java.util.Date;

/**
 * @author INGENIERO JAVIER
 *
 */
public class MovimientoDetalleDTO {
	private int id;
	private String movimientoDescripcion;
	private String item;
	private int cantidad;
	
	
	
	public MovimientoDetalleDTO() {
		super();
	}
	public MovimientoDetalleDTO(int id, String movimientoDescripcion, String item, int cantidad) {
		super();
		this.id = id;
		this.movimientoDescripcion = movimientoDescripcion;
		this.item = item;
		this.cantidad = cantidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovimientoDescripcion() {
		return movimientoDescripcion;
	}
	public void setMovimientoDescripcion(String movimientoDescripcion) {
		this.movimientoDescripcion = movimientoDescripcion;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "MovimientoDetalleDTO [id=" + id + ", movimientoDescripcion=" + movimientoDescripcion + ", item=" + item
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
}
