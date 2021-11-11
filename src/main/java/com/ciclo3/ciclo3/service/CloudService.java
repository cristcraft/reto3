package com.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Cloud;
import com.ciclo3.ciclo3.repository.CloudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloudService {

    @Autowired
    private CloudRepository cloudRepository;

    public List<Cloud> getAll(){
        return cloudRepository.getAll();
    }

    public Optional<Cloud> getCloud(int id){
        return cloudRepository.getCloud(id);
    }


    public Cloud save(Cloud p){
        if(p.getId()==null){
            return cloudRepository.save(p);
        }else{
            Optional<Cloud> paux=cloudRepository.getCloud(p.getId());
            if(paux.isEmpty()){
                return cloudRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}
