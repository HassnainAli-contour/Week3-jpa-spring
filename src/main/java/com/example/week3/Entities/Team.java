package com.example.week3.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Team")
@Table(name = "team")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team extends MyEntity {
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
    private String name;

    //........................................Relationships.................................................................................
//  @JsonManagedReference
 //   @OneToMany(mappedBy = "team",targetEntity = Player.class,cascade = CascadeType.REMOVE,orphanRemoval = true)
//    //@JoinColumn(name = "team_id",referencedColumnName = "")
  //  private List<Player> players;

//    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE,targetEntity = Match.class)
//    @JoinTable(name="match_team",
//            joinColumns = {
//            @JoinColumn(name="team_id",referencedColumnName = "id")
//    },inverseJoinColumns = {
//            @JoinColumn(name = "match_id",referencedColumnName = "id")
//    }
//    )
    @ManyToMany(targetEntity = Match.class)
    private List<Match> matches;

}
