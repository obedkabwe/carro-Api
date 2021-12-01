package com.obed.carro.resource;



import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.obed.carro.model.Carro;
import com.obed.carro.repositories.CarroRepository;


@RestController
@RequestMapping( "/carros")
public class CarroResource {
    
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping
	public List<Carro> getAllCarrros(){
		return carroRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Carro> criar(@RequestBody Carro carro, HttpServletResponse response) {
	Carro carroSalva = carroRepository.save(carro);
	URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(carroSalva.getId()).toUri();
	response.setHeader("Location", uri.toASCIIString());
	return ResponseEntity.created(uri).body(carroSalva);
		
	}
	
	//find carro by ID
	
	@GetMapping("/{id}")
	public ResponseEntity<Carro> buscarPeloCodigo(@PathVariable Integer id) {
		 Optional<Carro> carroEncotrada = carroRepository.findById(id);

	        if (carroEncotrada.isPresent()) {
	            return new ResponseEntity<Carro>(carroEncotrada.get(), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	
	//Delete
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Integer id){
		carroRepository.deleteById(id);
	}
	
	
	

	
	
	
	
}
