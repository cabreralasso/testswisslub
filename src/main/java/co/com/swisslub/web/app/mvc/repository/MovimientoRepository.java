/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.Movimiento;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
	public List<Movimiento> findById_estado(Integer id);
}
