package com.example.week3.Entities;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "tournament")
public class Tournament extends MyEntity {
    @Id
    @SequenceGenerator(
            name = "tournament_sequence",
            sequenceName = "tournament_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator= "tournament_sequence"
    )
    @Column(name = "id")
    private long id;
    private String name;

//    @OneToMany(targetEntity = Match.class,fetch = FetchType.LAZY)
//    private List<Match> matches;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
