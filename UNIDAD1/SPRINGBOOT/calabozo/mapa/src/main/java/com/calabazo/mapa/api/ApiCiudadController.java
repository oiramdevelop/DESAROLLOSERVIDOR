package com.calabazo.mapa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calabazo.mapa.model.Ciudad;
import com.calabazo.mapa.repository.CiudadRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/ciudades")
public class ApiCiudadController {

    @Autowired
    private CiudadRepository ciudadRepository;

    // Punto de acceso para peticiones GET de /api/ciudad
    // devolverá un json con todas las ciudades
    @GetMapping
    public List<Ciudad> getAllCiudades() {
        // Usando el metodo FindAll sacamos todos los registros de la entidad
        // Asociada y los devolvemos como una lista
        // Al ser un restController se convertira a json
        return ciudadRepository.findAll();
    }
    	/*
	 * Creamos en endpong para saccar una unica entidad 
	 * A la hora de reciirparmetros se pueden coger como  parametros rl
	 * o parametro get get , es decir vayan direcatmente en la url o que se a con elformato 
	 * /api/ciudades?sexo=M%ciudad=madrid
	 * 
	 */
    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> getCiudadById(@PathVariable Long id) {
        /*
         * La funcion devuelve un ResponseEntity a la solicitud de la api , es una respuesta completa
         * con multiples configuraciones
         * primero sacamos la ciudad asociada a dicho id y si existe mapeamos la salida a una responseEntity
         * que tiene como cuerpo los datos de la entidad ciudad del id 
         * Si no existe nos devuelve notFound, es obligatorio poner orElse ya que map devuelve un optional , es decir algo opcional
         * 
         * 
         */
        return ciudadRepository.findById(id).map(ciudad -> ResponseEntity.ok().body(ciudad)
        .orElse(ResponseEntity.noContent().build()));
    }
    @PostMapping("/crear")
    public Ciudad createCity(@RequestBody Ciudad ciudad) {
        //TODO: process POST request
        
        return ciudadRepository.save(ciudad);
    }
    
    

}
