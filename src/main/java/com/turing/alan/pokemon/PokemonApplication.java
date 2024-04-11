package com.turing.alan.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.turing.alan.pokemon.domain.Pokemon;
import com.turing.alan.pokemon.service.PokemonService;

@SpringBootApplication
public class PokemonApplication implements CommandLineRunner {

	@Autowired
	private PokemonService service;
	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Insertamos
		this.service.create(new Pokemon("Pikachu"));

	}

}
