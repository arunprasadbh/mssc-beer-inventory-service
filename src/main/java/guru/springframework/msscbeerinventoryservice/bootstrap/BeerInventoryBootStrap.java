package guru.springframework.msscbeerinventoryservice.bootstrap;

/*
 * Created by arunabhamidipati on 02/11/2019
 */

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Slf4j
//@Component
@RequiredArgsConstructor
public class BeerInventoryBootStrap implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
    public static final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID BEER_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID BEER_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");

    private final BeerInventoryRepository beerInventoryRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerInventory();
    }

    private void loadBeerInventory() {
        BeerInventory beerInventory1 = BeerInventory.builder()
                .beerId(BEER_1_UUID)
                .upc(BEER_1_UPC)
                .quantityOnHand(50)
                .build();
        beerInventoryRepository.save(beerInventory1);

        BeerInventory beerInventory2 = BeerInventory.builder()
                .beerId(BEER_2_UUID)
                .upc(BEER_2_UPC)
                .quantityOnHand(50)
                .build();
        beerInventoryRepository.save(beerInventory2);

        BeerInventory beerInventory3 = BeerInventory.builder()
                .beerId(BEER_3_UUID)
                .upc(BEER_3_UPC)
                .quantityOnHand(50)
                .build();
        beerInventoryRepository.save(beerInventory3);
    }
}
