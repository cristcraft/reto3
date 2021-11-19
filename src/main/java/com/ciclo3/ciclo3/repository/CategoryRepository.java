package com.ciclo3.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.ciclo3.ciclo3.model.Category;
import com.ciclo3.ciclo3.repository.crud.CategoryCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository  
public class CategoryRepository{
    
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category p){
        return categoryCrudRepository.save(p);
    }
}