package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Cientifico;

public interface CientificoDAO extends JpaRepository<Cientifico, String>{

}
