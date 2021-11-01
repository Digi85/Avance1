package com.scabdi.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scabdi.project.Entity.Modulo;


public interface ModuloRepository extends JpaRepository<Modulo, Integer>{
	 //LISTAR
		@Query(value = "{call SP_LISTA_TBL_MODULO()}", nativeQuery = true) 
		List<Modulo> listaModulos();
}
