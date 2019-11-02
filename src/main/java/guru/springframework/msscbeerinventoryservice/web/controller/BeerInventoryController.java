package guru.springframework.msscbeerinventoryservice.web.controller;

/*
 * Created by arunabhamidipati on 02/11/2019
 */

import guru.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import guru.springframework.msscbeerinventoryservice.web.mapper.BeerInventoryMapper;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;

    @GetMapping("/api/v1/{beerId}/inventory")
    List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId){

        log.debug("Finding inventory for beerId:" + beerId);

        return beerInventoryRepository.findAllByBeerId(beerId)
                .stream()
                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());

    }
}
