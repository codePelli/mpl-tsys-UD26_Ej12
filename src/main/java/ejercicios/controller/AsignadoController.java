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

import ejercicios.dto.Asignado;
import ejercicios.service.IAsignadoService;

@RestController
@RequestMapping("/asignado")
public class AsignadoController {
	
	@Autowired
	IAsignadoService asiService;;

	@GetMapping("/list")
	public List<Asignado> listarAsignadoa() {
		
		return asiService.listAsignado();
	}

	@PostMapping("/add")
	public Asignado saveAsignado(@RequestBody Asignado asignado) {
		
		return asiService.saveAsignado(asignado);
	}

	@GetMapping("{id}")
	public Asignado asigPorId(@PathVariable(name = "id") int id) {
		
		Asignado asignado = new Asignado();
		return asignado;
	}

	@PutMapping("{id}")
	public Asignado updateAsignado(@PathVariable(name = "id") int id, @RequestBody Asignado asignado) {

		Asignado asi = new Asignado();
		Asignado asiUpdated = new Asignado();
		asi.setId(id);
		asi.setCientifico(asignado.getCientifico());
		asi.setProyecto(asignado.getProyecto());

		return asiUpdated;
	}

	@DeleteMapping("{id}")
	public void deleteAsignado(@PathVariable(name = "id") int id) {
		asiService.deleteAsignado(id);
	}
}
