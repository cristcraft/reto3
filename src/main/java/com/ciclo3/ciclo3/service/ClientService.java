package com.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Client;
import com.ciclo3.ciclo3.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int id){
        return clientRepository.getClient(id);
    }


    public Client save(Client p){
        if(p.getId()==null){
            return clientRepository.save(p);
        }else{
            Optional<Client> paux=clientRepository.getClient(p.getId());
            if(paux.isEmpty()){
                return clientRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}
