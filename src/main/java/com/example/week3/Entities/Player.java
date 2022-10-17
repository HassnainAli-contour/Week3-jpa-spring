package com.example.week3.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Player")
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    private int runs;

    private int matchesPlayed;

    @ManyToOne(targetEntity = Team.class,cascade = CascadeType.MERGE)
    @JoinColumn(nullable = false,name = "team_id",updatable = true)
    private Team team;
}
