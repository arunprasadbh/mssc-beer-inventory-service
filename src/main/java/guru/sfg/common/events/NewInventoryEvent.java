package guru.sfg.common.events;

/*
 * Created by arunabhamidipati on 29/12/2019
 */
import guru.springframework.msscbeerinventoryservice.web.model.BeerDto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }

}
