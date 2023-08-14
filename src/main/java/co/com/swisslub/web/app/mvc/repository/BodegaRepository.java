/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.Bodega;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
