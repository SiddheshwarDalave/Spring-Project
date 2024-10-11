package com.example.simpleproject.Service;


import com.example.simpleproject.Models.Developer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class DevService {
    List<Developer> listOfDeveloper=new ArrayList<>();


    public Developer createNewDeveloper(Developer developer) {
        Developer newDevloper= new Developer(developer.getName(), developer.getAssignment(), developer.getId());
        listOfDeveloper.add(newDevloper);
        return newDevloper;
    }

    public List<Developer> getAllDeveloper() {
        return listOfDeveloper;
    }

    public Developer getDevById(@PathVariable String id) {
        for(Developer dev: listOfDeveloper){
            if(dev.getId().equals(id)){
                return dev;
            }
        }
        return null;
    }
}
