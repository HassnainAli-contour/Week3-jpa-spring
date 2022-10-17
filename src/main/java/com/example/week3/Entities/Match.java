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

    @ManyToOne(targetEntity = Tournament.class,cascade = CascadeType.MERGE)
    @JoinColumn(nullable = false,name = "tournament_id")
    private Tournament tournament;


    @ManyToMany(mappedBy = "matches",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Team> teams;

}