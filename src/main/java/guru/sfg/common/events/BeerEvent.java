package guru.sfg.common.events;

/*
 * Created by arunabhamidipati on 29/12/2019
 */

import guru.springframework.msscbeerinventoryservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -6816411330002278581L;

    private  BeerDto beerDto;
}
