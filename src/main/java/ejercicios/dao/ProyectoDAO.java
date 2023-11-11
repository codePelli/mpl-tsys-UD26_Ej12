package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Cientifico;
import ejercicios.dto.Proyecto;

public interface ProyectoDAO  extends JpaRepository<Proyecto, String>{

}
