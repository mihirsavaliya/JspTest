package com.example.jsptest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jsptest.model.HospitalTest;

@Repository
public interface HospitalTestRepo extends JpaRepository<HospitalTest, Long>{

}
