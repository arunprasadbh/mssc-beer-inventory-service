package guru.springframework.msscbeerinventoryservice.service;

/*
 * Created by arunabhamidipati on 31/12/2019
 */

import guru.springframework.msscbeerinventoryservice.config.JmsConfig;
import guru.sfg.common.events.NewInventoryEvent;
import guru.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import guru.springframework.msscbeerinventoryservice.web.mapper.BeerInventoryMapper;
import guru.springframework.msscbeerinventoryservice.web.model.BeerDto;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NewInventoryService {

    public final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper mapper;

    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent event){
        log.debug("Got Inventory: " + event.toString());
        BeerDto beerDto = event.getBeerDto();
        BeerInventoryDto inventoryDto = BeerInventoryDto.builder()
                .beerId(beerDto.getId())
                .upc(beerDto.getUpc())
                .quantityOnHand(beerDto.getQuantityOnHand())
                .build();
        beerInventoryRepository.save(mapper.beerInventoryDtoToBeerInventory(inventoryDto));
    }
}
