package com.example.LaptopStore.Service;

import com.example.LaptopStore.Model.laptopDetails;

import java.util.List;

public interface service {
    public List<laptopDetails> getAll();
    public laptopDetails getById(int id);
    public String addLaptop(laptopDetails laptop);
    public String updateLaptop(int id,laptopDetails laptop);
    public String deleteLaptop(int id);

}
