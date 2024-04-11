package com.turing.alan.pokemon.service;

import org.springframework.stereotype.Service;

import com.turing.alan.pokemon.domain.Pokemon;
import com.turing.alan.pokemon.domain.PokemonRepository;

@Service
public class PokemonServiceImpl implements PokemonService {

    
    private PokemonRepository repository;

    public PokemonServiceImpl(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Pokemon> getAll() {
        return this.repository.findAll();
    }

    @Override
    public void create(Pokemon pokemon) {

        this.repository.save(pokemon);
    }
    
}
