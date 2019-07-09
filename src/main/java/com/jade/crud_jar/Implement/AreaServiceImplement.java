
package com.jade.crud_jar.Implement;


import com.jade.crud_jar.model.CtArea;
import com.jade.crud_jar.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.jade.crud_jar.service.AreaService;

@Service
public class AreaServiceImplement implements AreaService {
    
    @Autowired
    private AreaRepository repository;

    @Override
    public CtArea create(CtArea user) {
        return repository.save(user);
    }

//    @Override
//    public CtArea delete(int id) {
//        CtArea user = findById(id);
//        if(user != null){
//            repository.delete(user);
//        }
//        return user;
//    }

    @Override
    public List<CtArea> findAll() {
        return repository.findAll();
    }

//    @Override
//    public CtArea findById(int idarea) {
//        return repository.findOne(idarea);
//    }

    @Override
    public CtArea update(CtArea user) {
        return repository.save(user);
    }
}
