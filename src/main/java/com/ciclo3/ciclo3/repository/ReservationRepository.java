package com.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Reservation;
import com.ciclo3.ciclo3.repository.crud.ReservationCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository  
public class ReservationRepository{
    
    @Autowired
    private ReservationCrudRepository repositoryCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) repositoryCrudRepository.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return repositoryCrudRepository.findById(id);
    }

    public Reservation save(Reservation p){
        return repositoryCrudRepository.save(p);
    }
}
