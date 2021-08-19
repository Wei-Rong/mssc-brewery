package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    public BeerDtoV2 getBeerById(UUID beerId);

    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    public void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    public void deletebyId(UUID beerId);
}
