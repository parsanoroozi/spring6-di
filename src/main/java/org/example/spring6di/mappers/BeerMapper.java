package org.example.spring6di.mappers;

import org.example.spring6di.entities.Beer;
import org.example.spring6di.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
