package de.iav.rickand;

import org.springframework.web.reactive.function.client.WebClient;

public class RickAndService {
    public final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");

}
