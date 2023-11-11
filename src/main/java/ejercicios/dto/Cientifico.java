package ejercicios.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Cientifico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nomApels")
	private String nomApels;
	
	@ManyToMany(mappedBy = "cientifico")
	@JsonIgnoreProperties("cientifico")
	private List<Proyecto> proyecto;

	public Cientifico(String dni, String nomApels, List<Proyecto> proyecto) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.proyecto = proyecto;
	}
	
	public Cientifico() {
		super();
	}
	
	public Cientifico(String dni, String nomApels) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomApels() {
		return nomApels;
	}
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	
	public List<Proyecto> getProyecto() {
		return proyecto;
	}
	public void setProyecto(List<Proyecto> proyecto) {
		this.proyecto = proyecto;
	}
}
