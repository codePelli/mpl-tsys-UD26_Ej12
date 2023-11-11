package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Proyecto;
import ejercicios.service.IProyectoService;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {

	@Autowired
	private IProyectoService proyectoService;
	
	@GetMapping("/list")
	public List<Proyecto> getProyectos(){
		
		return proyectoService.listProyecto();
	}
	
	@GetMapping("/{id}")
	public Proyecto proyectoPorCod(@PathVariable String id) {
		
		return proyectoService.proyectoPorCodigo(id);
	}
	
	@PostMapping("/add")
	public Proyecto insertProyecto(@RequestBody Proyecto proyecto) {
	
		return proyectoService.saveProyecto(proyecto);
	}
	
	@PutMapping("/{id}")
	public Proyecto updateProyecto(@PathVariable(name = "id") String id, 
			@RequestBody Proyecto proyecto) {
		
		return proyectoService.updateProyecto(proyecto);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProyecto(@PathVariable String id) {
		
		proyectoService.deleteProyecto(id);
	}
}
