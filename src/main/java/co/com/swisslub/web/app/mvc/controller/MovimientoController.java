/**
 * 
 */
package co.com.swisslub.web.app.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.swisslub.web.app.mvc.model.Movimiento;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDTO;
import co.com.swisslub.web.app.mvc.service.IMovimientoService;

/**
 * @author INGENIERO JAVIER
 *
 */
@Controller
@RequestMapping("/movimiento")
public class MovimientoController {
	@Autowired
	private IMovimientoService service;
	public void guardar(){
		
	}
	@GetMapping(path = "/movimiento/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovimientoDTO> bucarId(@PathVariable("id") int id){
        MovimientoDTO movimiento =service.buscarId(id);
        return new ResponseEntity<MovimientoDTO>(movimiento, HttpStatus.OK);
    }
	
	@GetMapping(path = "/movimientos", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listarTodo(){
        List<Movimiento> entities =service.listar();
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@GetMapping(path = "/movimientos_estado/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listarXEstado(@PathVariable("id") String estado){
        List<Movimiento> entities =service.buscarEstado(estado);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@PostMapping(path = "/guardar", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> guardarMovimiento(@RequestBody Movimiento movimiento ){
        Movimiento entities =service.crear(movimiento);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@PostMapping(path = "/editar", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> editarMovimiento(@RequestBody Movimiento movimiento ){
        Movimiento entities =service.editar(movimiento);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@PostMapping(path = "/eliminar/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> eliminarMovimiento(@PathVariable("id") int id){
        String  mensaje=service.eliminar(id);
        return new ResponseEntity<Object>(mensaje, HttpStatus.OK);
    }
}
