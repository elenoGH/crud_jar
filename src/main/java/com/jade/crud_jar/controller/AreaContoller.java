
package com.jade.crud_jar.controller;
/**
 * @author mperez
 */
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://www.appjade.com:4200", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/Usuarios")
public class AreaContoller {
    @GetMapping
    public List<Object> index() {
        List<Object> person = getDetails();
        return person;
    }
    
    public static List<Object> getDetails() 
    { 
        String name = "Geek"; 
        int age = 35; 
        char gender = 'M'; 
  
        return Arrays.asList(name, age, gender); 
    }
}
