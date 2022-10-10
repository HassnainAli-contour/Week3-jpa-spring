package com.example.week3.Entities;

import java.util.Arrays;
import java.util.HashSet;

public class Team extends MyEntity{
    private HashSet<Player> teamPlayers;

    public Team(int id,String name)
    {
        super();
        this.name = name;
        this.teamPlayers = new HashSet<>();
    }
    public void setTeamPlayers(Player[] players)
    {
        Arrays.stream(players).forEach(player -> this.teamPlayers.add(player));
    }

    public HashSet<Player> getPlayers(){
        return teamPlayers;
    }
}
