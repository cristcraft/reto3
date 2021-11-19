package com.ciclo3.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Reservation;
import com.ciclo3.ciclo3.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }

    public Optional<Reservation> getReservation(int id){
        return reservationRepository.getReservation(id);
    }


    public Reservation save(Reservation p){
        if(p.getId()==null){
            return reservationRepository.save(p);
        }else{
            Optional<Reservation> paux=reservationRepository.getReservation(p.getId());
            if(paux.isEmpty()){
                return reservationRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}
