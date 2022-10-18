package com.example.week3.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.*;

import static javax.persistence.GenerationType.SEQUENCE;


@Entity
@Table(name = "match")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match extends MyEntity {
    @Id
    @SequenceGenerator(
            name = "match_sequence",
            sequenceName = "match_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator= "match_sequence"
    )
    @Column(name = "id")
    private long id;


    private String name;

    @ManyToOne(targetEntity = Tournament.class,cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false,name = "tournament_id")
    private Tournament tournament;


//    @ManyToMany(cascade = CascadeType.MERGE,targetEntity = Match.class)
//    @JoinTable(
//            name="match_team",
//            joinColumns={@JoinColumn(name="match_id", referencedColumnName="id")},
//            inverseJoinColumns={@JoinColumn(name="team_id", referencedColumnName="id")})
    @ManyToMany(targetEntity = Team.class)
    private List<Team> teams;

}