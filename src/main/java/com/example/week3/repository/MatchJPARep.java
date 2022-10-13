package com.example.week3.repository;

import com.example.week3.Entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchJPARep extends JpaRepository<Match,Long> {
}
