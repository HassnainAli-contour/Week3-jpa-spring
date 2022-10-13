package com.example.week3.repository;

import com.example.week3.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;






public interface TeamJPARep extends JpaRepository<Team, Long> {

//    @Query("Select p.name,t.name from customer c join team ")
//    public String[] getJoinInformation();

//    @Query("update Team t1 set t1.name=t.name where t1.id= t.id")
//    public void updateEntity(Team t);

}
