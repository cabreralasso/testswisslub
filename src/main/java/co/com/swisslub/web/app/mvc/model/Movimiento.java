/**
 * 
 */
package co.com.swisslub.web.app.mvc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * @author INGENIERO JAVIER
 *
 */
@Entity
@Table(name = "movimiento")
public class Movimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_mov")
	private int id;
	
	@Column(name="descripción_mov")
	private String descripcion;
	
	@OneToOne
	@JoinColumn(name="id_empresa_mov")
	private Empresa empresa;
	
	@OneToOne
	@JoinColumn(name="id_bod_origen_mov")
	private Bodega origen;
	
	@OneToOne
	@JoinColumn(name="id_bod_destino_mov")
	private Bodega destino;
	
	@Column(name="fecha_creacion_mov")
	private Date creacion;
	
	@Column(name="fecha_entrega_mov")
	private Date entrega; 
	
	@OneToOne
	@JoinColumn(name="id_estado_mov")
	private MovimientoEstado estado;

	
	
	public Movimiento() {
		super();
	}

	public Movimiento(int id, String descripcion, Empresa empresa, Bodega origen, Bodega destino, Date creacion,
			Date entrega, MovimientoEstado estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.origen = origen;
		this.destino = destino;
		this.creacion = creacion;
		this.entrega = entrega;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Bodega getOrigen() {
		return origen;
	}

	public void setOrigen(Bodega origen) {
		this.origen = origen;
	}

	public Bodega getDestino() {
		return destino;
	}

	public void setDestino(Bodega destino) {
		this.destino = destino;
	}

	public Date getCreacion() {
		return creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public MovimientoEstado getEstado() {
		return estado;
	}

	public void setEstado(MovimientoEstado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", descripcion=" + descripcion + ", empresa=" + empresa + ", origen=" + origen
				+ ", destino=" + destino + ", creacion=" + creacion + ", entrega=" + entrega + ", estado=" + estado
				+ "]";
	}

	
	
}
