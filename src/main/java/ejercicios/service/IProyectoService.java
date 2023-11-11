package ejercicios.service;

import java.util.List;

import ejercicios.dto.Cientifico;
import ejercicios.dto.Proyecto;

public interface IProyectoService {

	List<Proyecto> listProyecto();
	
	Proyecto saveProyecto(Proyecto proyecto);
	
	Proyecto proyectoPorCodigo(String id);
	
	Proyecto updateProyecto(Proyecto proyecto);
	
	void deleteProyecto(String id);
}
