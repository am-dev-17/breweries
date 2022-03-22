package com.amarmodi.springframework.brewery.web.mappers;

import com.amarmodi.springframework.brewery.domain.Beer;
import com.amarmodi.springframework.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
