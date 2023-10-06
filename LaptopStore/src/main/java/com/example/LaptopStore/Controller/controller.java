package com.example.LaptopStore.Controller;

import com.example.LaptopStore.Model.laptopDetails;
import com.example.LaptopStore.Service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptopApi")
public class controller {
    @Autowired
    private service services;

    @GetMapping("/getAll")
    public List<laptopDetails> getAll(@RequestBody laptopDetails laptop){
        return services.getAll();
    }
    @GetMapping("/getId/{id}")
    public laptopDetails getById(@PathVariable int id) {
        return services.getById(id);
    }

    @PostMapping("/add")
    public String addLaptop(@RequestBody  laptopDetails laptop){
        return services.addLaptop(laptop);
    }
    @PutMapping("/update/{id}")
    public String updatelaptop(@PathVariable int id,@RequestBody laptopDetails laptop){
        return  services.updateLaptop(id,laptop);

    }
    @DeleteMapping("/delete/{id}")
    public String deletelaptop(@PathVariable int id){
        return services.deleteLaptop(id);
    }

}
