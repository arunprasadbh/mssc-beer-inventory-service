package guru.springframework.msscbeerinventoryservice.web.mapper;

/*
 * Created by arunabhamidipati on 02/11/2019
 */

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

     BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
     BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);
}
