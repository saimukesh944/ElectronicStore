package com.example.LaptopStore.Service;

import com.example.LaptopStore.Model.laptopDetails;
import com.example.LaptopStore.Repository.repository;
import com.example.LaptopStore.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serviceImpl implements service {
    @Autowired
    private repository repo;


    @Override
    public List<laptopDetails> getAll() {
        return repo.findAll();
    }

    @Override
    public laptopDetails getById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public String addLaptop(laptopDetails laptop) {
         repo.save(laptop);
         return "laptop added successfully";
    }

    @Override
    public String updateLaptop(int id, laptopDetails laptop) {
        Optional<laptopDetails> container = repo.findById(id);
        if (container.isPresent()) {
            laptopDetails c = container.get();
            c.setLaptopCost(laptop.getLaptopCost());
            c.setLaptopName(laptop.getLaptopName());
            c.setLaptopColour(laptop.getLaptopColour());
            repo.save(c);
            return "LaptopDetails updated";
        } else {
            return "LaptopDetails not updated";
        }
    }


    @Override
    public String deleteLaptop(int id) {
            Optional<laptopDetails> container = repo.findById(id);
            if (container.isPresent()){
                laptopDetails c=container.get();
                repo.delete(c);
                return "laptop deleted";
            }
            else {
                return "laptop not found";
            }

    }
}
