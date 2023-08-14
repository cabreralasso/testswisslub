/**
 * 
 */
package co.com.swisslub.web.app.mvc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.swisslub.web.app.mvc.model.Empresa;
import co.com.swisslub.web.app.mvc.service.IEmpresaService;

/**
 * @author INGENIERO JAVIER
 *
 */
@Controller
@RequestMapping("/api")
public class EmpresaController {

	@Autowired
	private IEmpresaService servicio;
	
	@GetMapping("/empresas")
	public List<Empresa> listarTodo(){
		List<Empresa>lista=  servicio.lista();
		for(Empresa empresa:lista) {
			System.out.println("en el controller "+empresa);
		}
		return lista;
	}
}
