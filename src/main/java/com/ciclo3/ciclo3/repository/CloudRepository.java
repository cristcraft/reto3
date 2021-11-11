package com.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Cloud;
import com.ciclo3.ciclo3.repository.crud.CloudCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CloudRepository {
    
    @Autowired
    private CloudCrudRepository cloudCrudRepository;

    public List<Cloud> getAll(){
        return (List<Cloud>) cloudCrudRepository.findAll();
    }

    public Optional<Cloud> getCloud(int id){
        return cloudCrudRepository.findById(id);
    }

    public Cloud save(Cloud p){
        return cloudCrudRepository.save(p);
    }
}
