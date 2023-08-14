package co.com.swisslub.web.app.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimiento_estado")
public class MovimientoEstado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mes")
	private Integer id;
	
	@Column(name="nombre_mes")
	private String nombre;
	
	@Column(name="estado_mes")
	private Integer estado;
	
	
	
	
	
	public MovimientoEstado() {
		super();
	}
	public MovimientoEstado(Integer id) {
		super();
		this.id=id;
	}
	public MovimientoEstado(Integer id, String nombre, Integer estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "MovimientoEstado [id=" + id + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	

}
