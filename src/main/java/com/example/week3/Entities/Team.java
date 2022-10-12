package com.example.week3.Entities;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Team")
@Table(name = "team")
public class Team extends MyEntity{

    @Id
    @SequenceGenerator(
            name = "team_sequence",
            sequenceName = "team_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator= "team_sequence"
    )
    @Column(name = "id")
    private long id;
    @Column(name = "name",columnDefinition = "TEXT",nullable = false)
    private String name;

    //.........................................................................................................................
    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    //@JoinColumn(name = "team_id",referencedColumnName = "id")
    private List<Player> players;

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
    Team(){

    }

    public Team(String name)
    {
        super();
        this.name = name;
    }

}
