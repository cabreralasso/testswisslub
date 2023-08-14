/**
 * 
 */
package co.com.swisslub.web.app.mvc.model;

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
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_bod")
	private int id;
	@Column(name="nombre_bod")
	private String nombre;

}
