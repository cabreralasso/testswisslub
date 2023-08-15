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
@Table(name = "bodega")
public class Bodega implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bod")
	private int id;
	@Column(name="nombre_bod")
	private String nombre;
	
	
	public Bodega() {
		super();
	}
	public Bodega(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
