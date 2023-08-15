/**
 * 
 */
package co.com.swisslub.web.app.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author INGENIERO JAVIER
 *
 */
@Entity
@Table(name = "movimiento_detalle")
public class MovimientoDetalle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mdet")
	private int id;
	
	@Column(name="id_mov")
	private int idMov;
	
	@Column(name="item_mdet")
	private String item;
		
	@Column(name="cantidad_mdet")
	private int cantidad;

	public MovimientoDetalle() {
		super();
	}
	
	public MovimientoDetalle(int id, Movimiento movimiento, String item, int cantidad) {
		super();
		this.id = id;
//		this.movimiento = movimiento;
		this.item = item;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	

	public int getIdMov() {
		return idMov;
	}

	public void setIdMov(int idMov) {
		this.idMov = idMov;
	}

	@Override
	public String toString() {
		return "MovimientoDetalle [id=" + id +  ", item=" + item + ", cantidad="
				+ cantidad + "]";
	}

	
	
	
	
}
