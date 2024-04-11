package com.turing.alan.pokemon.service;

import com.turing.alan.pokemon.domain.Pokemon;

public interface PokemonService {

    public Iterable<Pokemon> getAll();
    public void create(Pokemon pokemon);
    
}
