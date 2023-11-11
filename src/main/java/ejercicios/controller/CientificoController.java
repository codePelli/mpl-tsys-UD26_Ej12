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

import ejercicios.dto.Cientifico;
import ejercicios.service.ICientificoService;

@RestController
@RequestMapping("/cientifico")
public class CientificoController {
	
	@Autowired
	private ICientificoService cientificoService;

	
	@GetMapping("/list")
	public List<Cientifico> getCientificos() {
		
		return cientificoService.listCientifico();
	}
	
	@GetMapping("/{dni}")
	public Cientifico cientificoPorCod(@PathVariable String dni) {
		
		return cientificoService.cientificoPorCodigo(dni);
	}
	
	@PostMapping("/add")
	public Cientifico insertCientifico(@RequestBody Cientifico cientifico) {
		
		return cientificoService.saveCientifico(cientifico);
	}
	
    @PutMapping("/{dni}")
    public Cientifico updateCientifico(@PathVariable(name = "dni") String dni, 
    		@RequestBody Cientifico cientifico) {
				
    	return cientificoService.updateCientifico(cientifico);
    }
    
    @DeleteMapping("/{dni}")
    public void deleteCientifico(@PathVariable String dni) {
    	
    	cientificoService.deleteCientifico(dni);
    }
}
