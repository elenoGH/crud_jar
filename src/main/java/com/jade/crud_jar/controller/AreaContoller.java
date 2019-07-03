
package com.jade.crud_jar.controller;
/**
 * @author mperez
 */
import com.jade.crud_jar.repository.AreaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://www.appjade.com:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class AreaContoller {
    @Autowired
    private AreaRepository areaRep;

    @GetMapping("/getAreas")
    public List<Areas> getAllAreas() {
        return areaRep.findAll();
    }
}
