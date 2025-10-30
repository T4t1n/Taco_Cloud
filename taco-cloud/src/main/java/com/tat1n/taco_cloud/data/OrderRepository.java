
package com.tat1n.taco_cloud.data;

import com.tat1n.taco_cloud.TacoOrder;

/**
 *
 * @author Jaimisky
 */
public interface OrderRepository {
    
    TacoOrder save(TacoOrder order);
    
}
