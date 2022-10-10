package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;
import com.example.week3.repository.GenericDAOImpl;
import org.springframework.stereotype.Service;

@Service
public class TeamService extends GenericCRUDService<Team>{
    TeamService(){

        Player p=new Player(223,"Saeed Anwer",23);
        Player p2=new Player(247,"Shahid Afridi",24);
        Player p3=new Player(256,"Abdul Qadir",22);
        Player p4=new Player(300,"Babar Azam",23);
        Player p5=new Player(222,"Imran Nazeer",25);
        Player p6=new Player(123,"Imran",25);



        //getting player.........................................................
        //System.out.println(managePlayer.get(256).getName());


        Team t=new Team(1,"Pakistan");
        //t.setTeamPlayers(new Player[]{p,p2,p3});
        Team t1=new Team(2,"India");
        //t1.setTeamPlayers(new Player[]{p4,p3,p5});
        Team t2=new Team(3,"Srilanka");
        //t2.setTeamPlayers(new Player[]{p4,p5,p});

        this.save(t);
        this.save(t1);
        this.save(t2);


     //   System.out.println(genericDAO.getClass().getSimpleName());
    }
}
