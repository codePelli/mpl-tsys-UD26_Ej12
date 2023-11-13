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
 	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn( name = "proyecto")
	private List<Asignado> asignado;

	public Proyecto(String id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public Proyecto() {
		super();
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
	@JsonIgnore
	@OneToMany(mappedBy = "asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

}
