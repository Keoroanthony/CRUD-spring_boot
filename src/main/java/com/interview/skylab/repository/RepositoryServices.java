package com.interview.skylab.repository;

import com.interview.skylab.entity.ServicesProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryServices extends JpaRepository<ServicesProducts, Integer> {
    @Query("FROM ServicesProducts i WHERE i.id= ?1")
    ServicesProducts findById(int id);
}
