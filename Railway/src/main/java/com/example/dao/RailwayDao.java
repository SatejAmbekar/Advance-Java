package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Railway;

public interface RailwayDao extends JpaRepository<Railway, Long> {

}
