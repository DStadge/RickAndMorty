package de.iav.rickand;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;
@Service
public class RickAndMortyService {
    public final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character/");



    public RickAndMortyCharacter getRickAndMortyCharacter(String id) {
        ResponseEntity<RickAndMortyCharacter> responseEntity = webClient.get()
                .uri(id)
                .retrieve()
                .toEntity(RickAndMortyCharacter.class)
                .block();



       RickAndMortyCharacter character = Objects.requireNonNull(responseEntity).getBody();
       return character;
/*
        return new RickAndMortyCharacter(
                character.id(),
                character.gender(),
                character.gender(),
                character.species()
        );*/
    }
}



