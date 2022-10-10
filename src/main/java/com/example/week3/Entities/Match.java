package com.example.week3.Entities;

import java.time.LocalDate;
import java.util.*;


public class Match extends MyEntity {

    private HashSet<Team> teams ;
    private LocalDate dueDate;
    private Team winner;
    HashMap<Player,Score> scoreCard;
    private int score;

    private static Random r= new Random();


    public HashSet<Team> getTeams() {
        return teams;
    }


    public Match(int id, String name){

        super();
        dueDate=LocalDate.now().minusDays(new Random().nextInt(10));
        score = 300-345;
        this.name = name;
        this.teams = new HashSet<Team>(2);
        scoreCard = new HashMap<>();
    }
    public HashMap<Player, Score> getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(HashMap<Player, Score> scoreCard) {
        this.scoreCard = scoreCard;
    }
    public void setScoreCard(Player players[],Score scores[]) {

        for (Player p : players){
            Score temp= new Score(r.nextInt(100),r.nextInt(10));
            scoreCard.put(p,temp);
        }


//        Arrays.stream(players).forEach((Player p) ->
//                {
//                    System.out.println(p.getName());
//                    scoreCard.put(p, new Score(r.nextInt(100),r.nextInt(10)));
//                }
//        );

    }

    public void setTeams(HashSet<Team> teams) {
        this.teams = teams;
    }
    public void seTeams(Team t1, Team t2) {

        teams.add(t1);
        teams.add(t2);

    }



    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Team getWinner() {
        winner = score>0? (Team) teams.toArray()[0]:(Team) teams.toArray()[1];
        return winner;
    }
}
