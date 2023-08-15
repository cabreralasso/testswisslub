/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
	public List<Movimiento> findByEstado(String id);
	
}
