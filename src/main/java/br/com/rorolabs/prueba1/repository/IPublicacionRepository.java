package br.com.rorolabs.prueba1.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rorolabs.prueba1.model.Publicacion;

@Repository
public interface IPublicacionRepository extends CrudRepository<Publicacion, String> {

	// <Publicacion, String>
	// eL PRIMERO ES EL NOMBRE DE LA TABLA, EN ESTE CASO Publicacion
	// el segundo seria el tipo de dato de la llave primaria de la tabla Publicacion

	// Querys especificas
	//@Query("select precio from publicacion where idpublicacion=:idpublicacion")
	//double precio(@Param("idpublicacion") String idpublicacion);

}
