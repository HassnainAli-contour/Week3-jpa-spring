package com.example.week3.Entities;

import java.util.Random;

public class Player extends MyEntity{
    private int age;
    private int runs;
    private int matchesPlayed;
    Team team;
    public Player(int id, String name, int age)
    {
        super(id,name);
        this.name = name;
        this.age = age;
        this.matchesPlayed = 0;
        this.runs = 10000+ new Random().nextInt(1000);
        this.matchesPlayed=new Random().nextInt(100);
    }



    public String getName() {
        return name;
    }


    public int getage() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
}
