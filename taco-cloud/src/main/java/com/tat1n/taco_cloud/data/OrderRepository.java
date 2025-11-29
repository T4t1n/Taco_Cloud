
package com.tat1n.taco_cloud.data;

import com.tat1n.taco_cloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jaimisky
 */
public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
    
//    TacoOrder save(TacoOrder order);
    
}
