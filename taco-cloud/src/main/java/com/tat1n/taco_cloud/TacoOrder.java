
package com.tat1n.taco_cloud;

import jakarta.validation.constraints.NotBlank;
import java.util.List;
import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author Jaimisky
 */

@Data
public class TacoOrder {
    
    @NotBlank(message="Delivery name is required")
    private String deliveryName;
    @NotBlank(message="Street is required")
    private String deliveryStreet;
    @NotBlank(message="City is required")
    private String deliveryCity;
    @NotBlank(message="State is required")
    private String deliveryState;
    @NotBlank(message="Zip code is required")
    private String deliveryZip;
    
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    
    private List<Taco> tacos = new ArrayList<>();
    
    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
