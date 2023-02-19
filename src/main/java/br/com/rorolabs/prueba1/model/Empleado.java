package br.com.rorolabs.prueba1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("EMPLEADO") //indica como se llama la tabla
public class Empleado {

	@Id // indica la llave primaria de la tabla
	@Column("idEmpleado") //asi se llama la columna de la base datos
	private Integer idEmpleado;
	
	@Column("nombre") //asi se llama la columna de la base datos
	private String nombre;

	@Column("direccion") //asi se llama la columna de la base datos
	private String direccion;

	@Column("email") //asi se llama la columna de la base datos
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
