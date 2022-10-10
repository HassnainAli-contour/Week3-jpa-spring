package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.repository.GenericDAOImpl;
import com.example.week3.repository.PlayerJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    PlayerJPARep playerJPARep;
    @Autowired
    PlayerService(PlayerJPARep playerjp){
        this.playerJPARep = playerjp;
        playerjp.save(new Player(
                "shahid",
                10000,
                333
        ));
    }
    public List<Player> getAll(){
        return  playerJPARep.findAll();
    }
}
