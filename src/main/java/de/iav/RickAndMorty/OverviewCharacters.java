package de.iav.RickAndMorty;

import java.util.List;

public record OverviewCharacters(

        InfoCharacters info,
        List <RickAndMortyCharacter>results
) {
}
