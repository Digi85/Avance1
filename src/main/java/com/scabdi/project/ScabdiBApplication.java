package com.scabdi.project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.scabdi.project.Entity.Modulo;
import com.scabdi.project.Entity.Rol;
import com.scabdi.project.Repository.ModuloRepository;
import com.scabdi.project.Repository.RolRepository;

@SpringBootApplication
public class ScabdiBApplication implements CommandLineRunner {

	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ScabdiBApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Listar Rol
		//List<Rol> se = rolRepository.listaRoles();
	    //for(int i=0;i<se.size(); i++) {
			//System.out.println(se.get(i).getId_rol());
			//System.out.println(se.get(i).getNo_rol());
		//}
		
		//BUSCAR ROL
		// Rol rl = rolRepository.buscar(1).get();
		 //System.out.println(rl.getId_rol() + " - " + rl.getNo_rol());
		
		//LISTAR MODULO
		 
		// List<Modulo> md = moduloRepository.listaModulos();
			//for(int i=0;i<md.size(); i++) {
				//System.out.println(md.get(i).getId_area());
				//System.out.println(md.get(i).getNo_modulo());
				//System.out.println(md.get(i).getDe_modulo());
				//System.out.println(md.get(i).getCa_total_recursos());
			//}
			//INSERTAR ROL
			//rolRepository.insertar("RolBcknd");
		//ELIMINAR ROL
		rolRepository.eliminar(4);
		
		// ACTUALIZAR PROGRESO
		//rolRepository.actualizar(4,"MiniRol");
	}

}
