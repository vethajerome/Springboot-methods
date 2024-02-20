package com.example.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prac.model.Pracmodel;

@Repository
public interface PracRepository extends JpaRepository<Pracmodel,Integer> {

    
} 
