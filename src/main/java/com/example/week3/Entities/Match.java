package com.example.week3.Entities;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.*;

import static javax.persistence.GenerationType.SEQUENCE;


@Entity
@Table(name = "match")
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

    @ManyToMany(mappedBy = "matches",fetch = FetchType.LAZY)
    private List<Team> teams;

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