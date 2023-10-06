package mobile.example.mobilesDemo.repository;

import mobile.example.mobilesDemo.model.MobileDetails;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<MobileDetails,Integer> {



}
