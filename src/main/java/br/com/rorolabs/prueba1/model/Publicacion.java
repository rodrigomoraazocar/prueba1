package br.com.rorolabs.prueba1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Publicacion")
public class Publicacion {
    
	@Id
	@Column("idPublicacion")
	private String idPublicacion;
	@Column("titulo")
	private String titulo;
	@Column("idTipo")
	private String idTipo;
	@Column("autor")
	private String autor;
	@Column("nroEdicion")
	private Integer nroEdicion;
	@Column("precio")
	private double precio;
	@Column("stop")
	private double stop;

	Publicacion() {

	}

	public Publicacion(String idPublicacion, String titulo, String idTipo, String autor, Integer nroEdicion,
			double precio, double stop) {

		this.idPublicacion = idPublicacion;
		this.titulo = titulo;
		this.idTipo = idTipo;
		this.autor = autor;
		this.nroEdicion = nroEdicion;
		this.precio = precio;
		this.stop = stop;
	}

	public String getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(String idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNroEdicion() {
		return nroEdicion;
	}

	public void setNroEdicion(Integer nroEdicion) {
		this.nroEdicion = nroEdicion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getStop() {
		return stop;
	}

	public void setStop(double stop) {
		this.stop = stop;
	}

}
