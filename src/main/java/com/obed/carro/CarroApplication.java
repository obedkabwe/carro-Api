package com.obed.carro;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.obed.carro.model.Carro;
import com.obed.carro.repositories.CarroRepository;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class  })
public class CarroApplication implements CommandLineRunner{
	
	@Autowired
	CarroRepository carroRepository;
	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Carro car1 = new Carro(null,"1", "Toyota", "Corrolla xe", "2016", "Flex", "4", "91.000", "Branca");
		Carro car2 = new Carro(null,"1", "Toyota", "Etios sedan", "2013", "Flex", "4", "33.000", "Azul");
		Carro car3 = new Carro(null,"2", "Ford", "Maverick GT V8", "1974", "Alcool", "2", "120.000", "Azul");
		Carro car4 = new Carro(null,"2", "ford", "Ranger 4x4", "2008", "Diesel", "4", "40.000", "Preta");
		Carro car5 = new Carro(null,"3", "Volkswagen", "Passat", "2009", "Gasolina", "4", "28.000", "Bordo");
		Carro car6 = new Carro(null,"4", "Fiat", "Uno Smart", "1995", "Gasolins", "2", "3.500", "Vermelha");
		
		carroRepository.saveAll(Arrays.asList(car1,car2,car3,car4,car5,car6));
		
		
	}

	
	
	
	
	
	
	
}
