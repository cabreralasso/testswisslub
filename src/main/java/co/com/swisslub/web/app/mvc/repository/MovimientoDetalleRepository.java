/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
@Transactional
public interface MovimientoDetalleRepository extends JpaRepository<MovimientoDetalle, Integer>{
	public List<MovimientoDetalle> findByidMov(int id); 
}
