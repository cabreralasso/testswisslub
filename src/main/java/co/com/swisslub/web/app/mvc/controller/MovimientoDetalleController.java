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
import co.com.swisslub.web.app.mvc.model.MovimientoDetalle;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDTO;
import co.com.swisslub.web.app.mvc.model.DTO.MovimientoDetalleDTO;
import co.com.swisslub.web.app.mvc.service.IMovimientoDetalleService;
import co.com.swisslub.web.app.mvc.service.IMovimientoService;

/**
 * @author INGENIERO JAVIER
 *
 */
@Controller
@RequestMapping("/detalle")
public class MovimientoDetalleController {
	@Autowired
	private IMovimientoDetalleService service;
	
	@GetMapping(path = "/movimientoDetalle/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovimientoDetalleDTO> bucarId(@PathVariable("id") int id){
        MovimientoDetalleDTO movimientoDetalle =service.buscarId(id);
        System.out.println("en el controller "+movimientoDetalle );
        return new ResponseEntity<MovimientoDetalleDTO>( movimientoDetalle , HttpStatus.OK);
    }
	
	@GetMapping(path = "/movimientoDetalles", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listarTodo(){
        List<MovimientoDetalle> entities =service.listar();
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@GetMapping(path = "/movimientoDetalles/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listarXMovimiento(@PathVariable("id") int idMov){
        List<MovimientoDetalle> entities =service.buscarMovimiento(idMov);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@GetMapping(path = "/movimientosDetalle_estado/{estado}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listarXEstado(@PathVariable("estado") String estado){
        List<MovimientoDetalle> entities =service.buscarXestado(estado);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@PostMapping(path = "/guardar", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> guardarMovimiento(@RequestBody MovimientoDetalle movimiento ){
        MovimientoDetalle entities =service.crear(movimiento);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	@PostMapping(path = "/editar", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> editarMovimiento(@RequestBody MovimientoDetalle movimientoDetalle ){
        MovimientoDetalle entities =service.editar(movimientoDetalle);
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
	
	@PostMapping(path = "/eliminar/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> eliminarMovimiento(@PathVariable("id") int id){
        String  mensaje=service.eliminar(id);
        return new ResponseEntity<Object>(mensaje, HttpStatus.OK);
    }
}
