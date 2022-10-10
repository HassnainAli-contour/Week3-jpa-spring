package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.repository.GenericDAOImpl;
import org.springframework.stereotype.Service;

@Service
public class PlayerService extends GenericCRUDService<Player>{
    PlayerService(){
        Player p=new Player(223,"Saeed Anwer",23);
        Player p2=new Player(247,"Shahid Afridi",24);
        Player p3=new Player(256,"Abdul Qadir",22);
        Player p4=new Player(300,"Babar Azam",23);
        Player p5=new Player(222,"Imran Nazeer",25);
        Player p6=new Player(123,"Imran",25);
        this.save(p);
        this.save(p2);
        this.save(p3);
        this.save(p4);
        this.save(p5);
        this.save(p6);
    }
}
