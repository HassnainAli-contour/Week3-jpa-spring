package com.example.week3.Entities;

public class Tournament extends MyEntity{
    private Match matches[];

    public Match[] getMatches() {
        return matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }

    public Tournament(int id, String name) {
        super();
    }
}
