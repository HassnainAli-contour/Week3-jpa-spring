package com.example.week3.dto;

import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;

import java.util.List;

public class TeamDTO {
    Team team;
    List<Player> players;

    public TeamDTO(Team team, List<Player> players) {
        this.team = team;
        this.players = players;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
