package ejercicios.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	private int horas;
	
	@ManyToMany
	@JoinTable(
			
			name = "asignado",
			joinColumns = @JoinColumn(name = "id_proyecto"),
			inverseJoinColumns = @JoinColumn(name = "id_cientifico")
	
	)
	
	private List<Cientifico> cientifico;

	public Proyecto(String id, String nombre, int horas, List<Cientifico> cientifico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.cientifico = cientifico;
	}

	public Proyecto(String id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public Proyecto() {
		super();
	}
	
	public List<Cientifico> getCientifico() {
		return cientifico;
	}

	public void setCientifico(List<Cientifico> cientifico) {
		this.cientifico = cientifico;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

}
