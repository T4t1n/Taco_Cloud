
package com.tat1n.taco_cloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jaimisky
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
}
