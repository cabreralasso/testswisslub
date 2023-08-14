/**
 * 
 */
package co.com.swisslub.web.app.mvc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.swisslub.web.app.mvc.model.Bodega;
import co.com.swisslub.web.app.mvc.model.Empresa;
import co.com.swisslub.web.app.mvc.service.IBodegaService;
import co.com.swisslub.web.app.mvc.service.IEmpresaService;

/**
 * @author INGENIERO JAVIER
 *
 */
@Controller
@RequestMapping("/api")
public class BodegaController {

	@Autowired
	private IBodegaService servicio;
	
	@GetMapping("/bodegas")
	public List<Bodega> listarTodo(){
		List<Bodega>lista=  servicio.lista();
		for(Bodega bodega:lista) {
			System.out.println("en el controller "+bodega);
		}
		return lista;
	}
}
