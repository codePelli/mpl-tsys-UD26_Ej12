package ejercicios.service;

import java.util.List;

import ejercicios.dto.Asignado;
import ejercicios.dto.Cientifico;

public interface IAsignadoService {

	List<Asignado> listAsignado();
	
	Asignado saveAsignado(Asignado asignado);
	
	Asignado asiPorCodigo(int id);
	
	Asignado updAsignado(Asignado asignado);
	
	void deleteAsignado(int id);
	
}
