package com.example.week3.repository;

import com.example.week3.Entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerJPARep extends JpaRepository<Player,Long> {
}
