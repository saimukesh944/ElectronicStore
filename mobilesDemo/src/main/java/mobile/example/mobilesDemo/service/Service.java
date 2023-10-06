package mobile.example.mobilesDemo.service;

import mobile.example.mobilesDemo.model.MobileDetails;

import java.util.List;


public interface Service {

    public List<MobileDetails> getAll();
    public MobileDetails getById(int id);
    public String addMobile(MobileDetails mobile);
    public String updateMobile(int id, MobileDetails mobile);
    public String deleteMobile(int id);
//    public List<MobileDetails> findByMobilename(String mobilename);


}
