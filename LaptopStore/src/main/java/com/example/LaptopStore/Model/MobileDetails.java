package com.example.LaptopStore.Model;


import lombok.Builder;

import javax.persistence.*;

@Builder

//@Document(collection="mobiles")
public class MobileDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String mobilename;
    private String mobileColour;
    private String mobileCost;

    public MobileDetails() {
        super();
    }

    public MobileDetails(int id, String mobilename, String mobileColour, String mobileCost) {
        this.id = id;
        this.mobilename = mobilename;
        this.mobileColour = mobileColour;
        this.mobileCost = mobileCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmobilename() {
        return mobilename;
    }

    public void setmobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    public String getMobileColour() {
        return mobileColour;
    }

    public void setMobileColour(String mobileColour) {
        this.mobileColour = mobileColour;
    }

    public String getMobileCost() {
        return mobileCost;
    }

    public void setMobileCost(String mobileCost) {
        this.mobileCost = mobileCost;
    }
}
