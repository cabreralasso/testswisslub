/**
 * 
 */
package co.com.swisslub.web.app.mvc.model;

import java.io.Serializable;
import java.lang.module.Configuration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author INGENIERO JAVIER
 *
 */
@Entity
@Table(name = "movimiento")
public class Movimiento implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mov")
	private int id;

	@Column(name = "descripción_mov")
	private String descripcion;

	@OneToOne
	@JoinColumn(name = "id_empresa_mov")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Empresa empresa;

	@OneToOne
	@JoinColumn(name = "id_bod_origen_mov")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Bodega origen;

	@OneToOne
	@JoinColumn(name = "id_bod_destino_mov")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Bodega destino;

	@Column(name = "fecha_creacion_mov")
	private Date creacion;

	@Column(name = "fecha_entrega_mov")
	private Date entrega;

	private String estado;

	@OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
	
//	@JoinColumns({
		@JoinColumn(name="id_mov",referencedColumnName="id_mov")		
//	})
	private  List<MovimientoDetalle> lista;

	public Movimiento() {
		super();
	}
	

	public Movimiento(int id, String descripcion, Empresa empresa, Bodega origen, Bodega destino, Date creacion,
			Date entrega, String estado, List<MovimientoDetalle> lista) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.origen = origen;
		this.destino = destino;
		this.creacion = creacion;
		this.entrega = entrega;
		this.estado = estado;
		this.lista = lista;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<MovimientoDetalle> getLista() {
		return lista;
	}

	public void setLista(List<MovimientoDetalle> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", descripcion=" + descripcion + ", empresa=" + empresa + ", origen=" + origen
				+ ", destino=" + destino + ", creacion=" + creacion + ", entrega=" + entrega + ", estado=" + estado
				+ ", lista=" + lista + "]";
	}

	
}
