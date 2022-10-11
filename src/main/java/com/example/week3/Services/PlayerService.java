package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.repository.PlayerJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService extends GenericService<Player> {


    @Autowired
    PlayerService(PlayerJPARep rep){
        this.repository = rep;
    }

//    public List<Player> getAll(){
//        return  playerJPARep.findAll();
//    }
//    public Player get(long id){
//        return playerJPARep.findById(id).get();
//    }
//    public void add(Player player){
//       playerJPARep.save(player);
//    };
//    public void delete(long id ){
//        playerJPARep.deleteById(id);
//    }
//
//    public void update(Player player){
//       Player temp= playerJPARep.findById(player.getId()).get();
//       temp.setTeam(player.getTeam());
//
//
//    }
}
