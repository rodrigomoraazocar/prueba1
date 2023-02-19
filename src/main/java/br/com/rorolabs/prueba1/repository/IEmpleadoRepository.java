package br.com.rorolabs.prueba1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rorolabs.prueba1.model.Empleado;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado,Integer>{
//                                                         <Clase,tipo de dado del id de la tabla en este caso Empleado>

	
	
}
