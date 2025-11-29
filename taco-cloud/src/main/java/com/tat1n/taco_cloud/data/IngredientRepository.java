
package com.tat1n.taco_cloud.data;

import com.tat1n.taco_cloud.Ingredient;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jaimisky
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String>{
    
//    Iterable<Ingredient> findAll();
//    
//    Optional<Ingredient> findById(String id);
//    
//    Ingredient save(Ingredient ingredient);
}
