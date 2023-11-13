package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.AsignadoDAO;
import ejercicios.dto.Asignado;

@Service
public class IAsignadoServiceImpl implements IAsignadoService{

	@Autowired
	AsignadoDAO asignadoDAO;
	
	@Override
	public List<Asignado> listAsignado() {
		// TODO Auto-generated method stub
		return asignadoDAO.findAll();
	}

	@Override
	public Asignado saveAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return asignadoDAO.save(asignado);
	}

	@Override
	public Asignado asiPorCodigo(int id) {
		// TODO Auto-generated method stub
		return asignadoDAO.findById(id).get();
	}

	@Override
	public Asignado updAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return asignadoDAO.save(asignado);
	}

	@Override
	public void deleteAsignado(int id) {
		// TODO Auto-generated method stub
		asignadoDAO.deleteById(id);
	}

}
