package mobile.example.mobilesDemo.controller;

import mobile.example.mobilesDemo.model.MobileDetails;

import mobile.example.mobilesDemo.repository.Repository;
import mobile.example.mobilesDemo.serviceImpl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobileApi")
public class controller {
    @Autowired
    private ServiceImpl services;
    @Autowired
    private Repository repo;

    @GetMapping("/getAll")
    public List<MobileDetails> getAll(){
        return services.getAll();
    }
    @GetMapping("/getId/{id}")
    public MobileDetails getById(@PathVariable int id) {
        return services.getById(id);
    }

    @PostMapping("/add")
    public String addMobile(@RequestBody MobileDetails mobile){
        return services.addMobile(mobile);
    }
    @PutMapping("/update/{id}")
    public String updateMobile(@PathVariable int id,@RequestBody MobileDetails mobile){
        return  services.updateMobile(id,mobile);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteMobile(@PathVariable int id){
        return services.deleteMobile(id);
    }
//    @GetMapping("/get/{mobileName}")
//    public List<MobileDetails> getByName(@PathVariable String mobilename){
//        return repo.findByMobilename(mobilename);
//    }

}
