package com.example.week3.Entities;

import com.example.week3.Services.PlayerService;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Random;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Player")
@Table(name = "player")
public class Player extends MyEntity{
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator= "player_sequence"
    )
    @Column(name = "id")
    private long id;
    @Column(name = "name",columnDefinition = "TEXT",nullable = false)
    private String name;

    @Column(name = "runs")
    private int runs;

    @Column(name = "matches")
    private int matchesPlayed;

    @ManyToOne
    @JoinColumn(name = "team_id",nullable = false)
    private Team team;



    public long getId() {
        return id;
    }
    Player(){

    }


    public Player( String name,int runs,int matchesPlayed)
    {
        super();
        this.name = name;
        this.matchesPlayed=matchesPlayed;
        this.matchesPlayed = 0;
        this.runs = runs;

     //   this.runs = 10000+ new Random().nextInt(1000);
        // this.matchesPlayed=new Random().nextInt(100);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }


}
