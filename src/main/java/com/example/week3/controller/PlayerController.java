package com.example.week3.controller;

import com.example.week3.Entities.Player;
import com.example.week3.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {


    @Autowired
    private PlayerService service ;
//    GenericDAOImpl managePlayer;

    PlayerController(PlayerService service)
    {
        this.service = service;
    }

    @GetMapping("/players")
    public List<Player> getPlayers()
    {
        return service.getAll();
    }

//    @GetMapping("getPlayer")
//    public Player getPlayer(@RequestParam(value = "id",defaultValue = "-1") int id)
//    {
//        Player p =(Player) service.get(id);
//        return p;           //!=null?p : null;
//    }
//    @PostMapping("/addplayer")
//    public String addPlayer(@RequestBody Player player)
//    {
//      return    service.save(player);
//     //   System.out.println(player.getRuns());
//    //   return String.format("%-20s  %-5d", player.getName(),player.getId());
//    }
//    @PutMapping("/updateplayer")
//    public String updatePlayer(@RequestBody Player player)
//    {
//        return service.update(player);
//    }
//
//    @DeleteMapping("/deleteplayer")
//    public String deletePlayer(@RequestParam(value = "id",defaultValue = "-1") int id){
//        if(service.delete(id))
//            return String.format("%-8s : %-5d Successfully deleted \n", "Player", id);
//        else
//            return String.format("%-8s : %-5d Not Found \n", "Player", id);
//    }

}