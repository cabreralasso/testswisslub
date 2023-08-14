/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
public interface MovimientoDetalleRepository extends JpaRepository<MovimientoDetalle, Integer>{

}
