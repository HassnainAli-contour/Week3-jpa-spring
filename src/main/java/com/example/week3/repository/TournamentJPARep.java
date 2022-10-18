package com.example.week3.repository;

import com.example.week3.Entities.Match;
import com.example.week3.Entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentJPARep extends JpaRepository<Tournament, Long> {
}
