package com.turing.alan.pokemon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long id;
    public Pokemon(String name) {
        this.name = name;
    }
    public String name;
    
}
