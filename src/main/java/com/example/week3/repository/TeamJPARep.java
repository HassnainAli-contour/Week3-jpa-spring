package com.example.week3.repository;

import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


public interface TeamJPARep extends JpaRepository<Team, Long> {

//    @Query("Select p.name,t.name from customer c join team ")
//    public String[] getJoinInformation();


    @Modifying
    @Transactional
    @Query("Delete from Player p where p.team = ?1")
    void deleteById(Team team);


    @Query("Select p from Player p where p.team = ?1")
    public List<Player> getAllWithPlayers(Team team);


}
