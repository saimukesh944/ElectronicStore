package com.example.LaptopStore.Controller;

import com.example.LaptopStore.Model.MobileDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class mobileRestController {


    @Autowired
    private RestTemplate restTemplate;

     static final  String MOBE_URL="http://localhost:8083/mobileApi/";

    @PostMapping("/restAdd")
    public String addMobile(@RequestBody MobileDetails mobileDetails){
        return restTemplate.postForObject(MOBE_URL+"add",mobileDetails,String.class);
    }
//    @GetMapping("/restGetAll")
//    public String getMobiles(){
//        return restTemplate.exchange(MOBE_URL+"getAll",HttpMethod.GET,null, String.class).getBody();
//    }
    @GetMapping("/restList")
    public String getMobile(){
        return restTemplate.exchange(MOBE_URL+"getAll",HttpMethod.GET,null,String.class).getBody();
    }

    @GetMapping("/restGetId/{id}")
    public String getByMobile(@PathVariable(value = "id") int id){
        return restTemplate.exchange(MOBE_URL+"getId/"+id,HttpMethod.GET,null,String.class).getBody();
    }

    @PutMapping("/restUpdate/{id}")
    public  String updateMobile(@PathVariable(value = "id")int id,@RequestBody MobileDetails mobileDetails){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<MobileDetails> entity=new HttpEntity<>(mobileDetails,headers);

        return  restTemplate.exchange(MOBE_URL+"update/"+id,HttpMethod.PUT,entity,String.class).getBody();
    }
    @DeleteMapping("/restDelete/{id}")
    public  String deleteMobile(@PathVariable (value = "id")int id,@RequestBody MobileDetails mobileDetails){
        return  restTemplate.exchange(MOBE_URL+"delete/"+id,HttpMethod.DELETE,null,String.class).getBody();
    }
}
