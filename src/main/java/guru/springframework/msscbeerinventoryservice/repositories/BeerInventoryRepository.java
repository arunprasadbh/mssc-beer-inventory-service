package guru.springframework.msscbeerinventoryservice.repositories;

/*
 * Created by arunabhamidipati on 02/11/2019
 */

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
    List<BeerInventory> findAllByBeerId(UUID beerId);
}
