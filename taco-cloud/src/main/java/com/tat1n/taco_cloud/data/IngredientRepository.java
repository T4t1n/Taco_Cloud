
package com.tat1n.taco_cloud.data;

import com.tat1n.taco_cloud.Ingredient;
import java.util.Optional;

/**
 *
 * @author Jaimisky
 */
public interface IngredientRepository {
    
    Iterable<Ingredient> findAll();
    
    Optional<Ingredient> findById(String id);
    
    Ingredient save(Ingredient ingredient);
}
