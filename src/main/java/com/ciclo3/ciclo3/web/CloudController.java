package com.ciclo3.ciclo3.web;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Cloud;
import com.ciclo3.ciclo3.service.CloudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cloud")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CloudController{
    
    @Autowired
    private CloudService cloudService;

    @GetMapping("/all")
    public List<Cloud> getClouds(){
        return cloudService.getAll();
    }
    

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud save(@RequestBody Cloud p){
        return cloudService.save(p);
    }

    
    @GetMapping("/{id}")
    public Optional<Cloud> getCloud(@PathVariable("id") int id){
        return cloudService.getCloud(id);
    }

}
    
