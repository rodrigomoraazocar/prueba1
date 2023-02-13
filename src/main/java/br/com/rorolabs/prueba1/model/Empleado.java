package br.com.rorolabs.prueba1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("EMPLEADO")
public class Empleado {

	@Id
	@Column("idEmpleado")
	private Integer idEmpleado;
	
	@Column("nombre")
	private String nombre;

	@Column("direccion")
	private String direccion;

	@Column("email")
	private String email;

	public Empleado() {
	}

	public Empleado(Integer idEmpleado, String nombre, String direccion, String email) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
