package com.example.week3.Services;

import com.example.week3.Entities.Match;
import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;
import org.springframework.stereotype.Service;

@Service
public class MatchService extends GenericCRUDService<Match>{
    MatchService(){
        Team t=new Team(1,"Pakistan");
        Team t1=new Team(2,"India");
        Team t2=new Team(3,"Srilanka");

        Match m = new Match(1,"Quarter Final");
        m.seTeams(t1,t2);
        Match m1 = new Match(2,"Semi Final");
        m1.seTeams(t,t2);
        Match m2 = new Match(3,"Final");
        m2.seTeams(t,t1);

        save(m);
        save(m1);
        save(m2);
    }
}