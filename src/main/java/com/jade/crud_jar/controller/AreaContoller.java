
package com.jade.crud_jar.controller;
/**
 * @author mperez
 */
import com.jade.crud_jar.model.CtArea;
import com.jade.crud_jar.service.AreaService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "http://www.appjade.com:4200", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/getAreas")
public class AreaContoller {
    
    @Autowired
    private AreaService areaService;
    
    @PostMapping("/createArea")
    public CtArea create(@RequestBody CtArea user){
        return areaService.create(user);
    }

//    @GetMapping(path = {"/{idarea}"})
//    public CtArea findOne(@PathVariable("idarea") int idarea){
//        return areaService.findById(idarea);
//    }

    @PutMapping(path = {"/{id}"})
    public CtArea update(@PathVariable("id") int id, @RequestBody CtArea area){
        area.setIdarea(id);
        return areaService.update(area);
    }

//    @DeleteMapping(path ={"/{id}"})
//    public CtArea delete(@PathVariable("id") int id) {
//        return areaService.delete(id);
//    }

    @GetMapping
    public List<CtArea> findAll(){
        return areaService.findAll();
    }
    
}
