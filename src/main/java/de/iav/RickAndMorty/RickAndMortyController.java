package de.iav.RickAndMorty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/character")
public class RickAndMortyController {

    private final RickAndMortyService rickAndMortyService;

    public RickAndMortyController(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }


    @GetMapping("/{id}")
    public RickAndMortyCharacter getSingleCharacter(@PathVariable String id) {
        return rickAndMortyService.getRickAndMortyCharacter(id);
    }

    @GetMapping()
   public List<RickAndMortyCharacter> getAllCharacter() {
     return this.rickAndMortyService.getRickAndMortyCharacter()

}



