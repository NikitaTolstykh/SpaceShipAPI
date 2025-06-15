package com.springboot.practice.repository;

import com.springboot.practice.entity.SpaceShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceShipRepository extends JpaRepository<SpaceShip, Long> {

}
