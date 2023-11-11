package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.ProyectoDAO;
import ejercicios.dto.Proyecto;

@Service
public class IProveedorServiceImpl implements IProyectoService{

	@Autowired
	private ProyectoDAO proveedorDAO;
	
	@Override
	public List<Proyecto> listProyecto() {
		// TODO Auto-generated method stub
		return proveedorDAO.findAll();
	}

	@Override
	public Proyecto saveProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proveedorDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoPorCodigo(String id) {
		// TODO Auto-generated method stub
		return proveedorDAO.findById(id).get();
	}

	@Override
	public Proyecto updateProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return proveedorDAO.save(proyecto);
	}

	@Override
	public void deleteProyecto(String id) {
		// TODO Auto-generated method stub
		proveedorDAO.deleteById(id);
	}

}
