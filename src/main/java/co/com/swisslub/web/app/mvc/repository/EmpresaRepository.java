/**
 * 
 */
package co.com.swisslub.web.app.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.swisslub.web.app.mvc.model.Empresa;

/**
 * @author INGENIERO JAVIER
 *
 */
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

}
