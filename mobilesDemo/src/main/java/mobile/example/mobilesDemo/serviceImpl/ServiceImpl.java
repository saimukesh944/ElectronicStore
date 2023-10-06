package mobile.example.mobilesDemo.serviceImpl;

import mobile.example.mobilesDemo.model.MobileDetails;

import mobile.example.mobilesDemo.repository.Repository;
import mobile.example.mobilesDemo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Repository repo;

    @Override
    public List<MobileDetails> getAll() {
        return repo.findAll();
    }

    @Override
    public MobileDetails getById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public String addMobile(MobileDetails mobile) {
        repo.save(mobile);
        return "Mobile added successfully";
    }

    @Override
    public String updateMobile(int id, MobileDetails mobile) {
        Optional<MobileDetails> container = repo.findById(id);
        if (container.isPresent()) {
            MobileDetails c = container.get();
          c.setmobilename(mobile.getmobilename());
            c.setMobileCost(mobile.getMobileCost());
            c.setMobileColour(mobile.getMobileColour());
            repo.save(c);
            return "Mobile Updated Successfully";
        } else {

            return "Mobile not Updated";
        }
    }

    @Override
    public String deleteMobile(int id) {
        Optional<MobileDetails> container = repo.findById(id);
        if (container.isPresent()) {
            MobileDetails c = container.get();
            repo.delete(c);
            return "Mobile Deleted Successfully";
        } else {
            return "Mobile Not found ";

        }


    }

//    @Override
//    public List<MobileDetails> findByMobilename(String mobilename) {
//        return repo.findByMobilename(mobilename);
//    }


}
