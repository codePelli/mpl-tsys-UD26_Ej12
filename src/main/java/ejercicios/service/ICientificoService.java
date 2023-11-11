package ejercicios.service;

import java.util.List;

import ejercicios.dto.Cientifico;

public interface ICientificoService {

	List<Cientifico> listCientifico();
	
	Cientifico saveCientifico(Cientifico cientifico);
	
	Cientifico cientificoPorCodigo(String dni);
	
	Cientifico updateCientifico(Cientifico cientifico);
	
	void deleteCientifico(String dni);
}
