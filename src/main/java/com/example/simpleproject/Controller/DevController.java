package com.example.simpleproject.Controller;

import com.example.simpleproject.Models.Developer;
import com.example.simpleproject.Service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DevController {

    @Autowired
    DevService devService;
    
    @GetMapping("/get")
    public String test() {
        return new String("Hello");
    }

    @PostMapping("/developer/create")
    public Developer createNewDeveloper(@RequestBody Developer developer){
        return devService.createNewDeveloper(developer);
    }

    @GetMapping("/developer/getAll")
    public List<Developer> getAllDeveloper(){
        return devService.getAllDeveloper();
    }

    @GetMapping("/developer/getDevByID/{Id}")
    public Developer getDevById(@PathVariable String Id){
        return devService.getDevById(Id);
    }
    
}
