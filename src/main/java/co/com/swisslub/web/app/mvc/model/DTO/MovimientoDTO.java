/**
 * 
 */
package co.com.swisslub.web.app.mvc.model.DTO;

import java.util.Date;

/**
 * @author INGENIERO JAVIER
 *
 */
public class MovimientoDTO {
	private int id;
	private String descripcion;
	private String empresa;
	private String bodegaOrigen;
	private String bodegaDestino;
	private Date fechaCreacion;
	private Date fechaEntrega;
	private String estado;

	public MovimientoDTO() {
		super();
	}

	public MovimientoDTO(int id, String descripcion, String empresa, String bodegaOrigen, String bodegaDestino,
			Date fechaCreacion, Date fechaEntrega, String estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.bodegaOrigen = bodegaOrigen;
		this.bodegaDestino = bodegaDestino;
		this.fechaCreacion = fechaCreacion;
		this.fechaEntrega = fechaEntrega;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getBodegaOrigen() {
		return bodegaOrigen;
	}

	public void setBodegaOrigen(String bodegaOrigen) {
		this.bodegaOrigen = bodegaOrigen;
	}

	public String getBodegaDestino() {
		return bodegaDestino;
	}

	public void setBodegaDestino(String bodegaDestino) {
		this.bodegaDestino = bodegaDestino;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.equalsIgnoreCase("p")) {
			this.estado = "Pendiente";
		}
		if (estado.equalsIgnoreCase("t")) {
			this.estado = "Transito";
		}
		if (estado.equalsIgnoreCase("e")) {
			this.estado = "Entregado";
		}

	}

	@Override
	public String toString() {
		return "MovimientoDTO [id=" + id + ", descripcion=" + descripcion + ", empresa=" + empresa + ", bodegaOrigen="
				+ bodegaOrigen + ", bodegaDestino=" + bodegaDestino + ", fechaCreacion=" + fechaCreacion
				+ ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + "]";
	}

}
