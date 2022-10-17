package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.repository.PlayerJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService extends GenericService<Player> {


    @Autowired
    PlayerService(PlayerJPARep rep){
        this.repository = rep;
    }
    @Override
    public boolean add(Player p){
        return (repository.save(p)==null);
    }

}
