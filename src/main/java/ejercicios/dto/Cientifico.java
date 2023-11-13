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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Cientifico {

	@Id
	private String dni;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "cientifico")
	private List<Asignado> asignado;

	public Cientifico() {
		super();
	}
	
	public Cientifico(String dni, String nomapels) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}
	
	@JsonIgnore
	@OneToMany(mappedBy = "asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}
	
}
