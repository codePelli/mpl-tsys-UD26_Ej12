package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.CientificoDAO;
import ejercicios.dto.Cientifico;

@Service
public class ICientificoServiceImpl implements ICientificoService{

	@Autowired
	private CientificoDAO cientificoDAO;
	
	@Override
	public List<Cientifico> listCientifico() {
		// TODO Auto-generated method stub
		return cientificoDAO.findAll();
	}

	@Override
	public Cientifico saveCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoPorCodigo(String dni) {
		// TODO Auto-generated method stub
		return cientificoDAO.findById(dni).get();
	}

	@Override
	public Cientifico updateCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cientificoDAO.save(cientifico);
	}

	@Override
	public void deleteCientifico(String dni) {
		// TODO Auto-generated method stub
		cientificoDAO.deleteById(dni);
	}

}
