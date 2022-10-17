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

    @GetMapping("getPlayer")
    public Player getPlayer(@RequestParam(value = "id",defaultValue = "-1") int id)
    {
        return service.get(id);            //!=null?p : null;
    }
    @PostMapping("/addplayer")
    public String addPlayer(@RequestBody Player player)
    {
      service.add(player);
      return "success ";
    }
    @PutMapping("/updateplayer")
    public Player updatePlayer(@RequestBody Player player)
    {
        return service.update(player);
    }

    @DeleteMapping("/deleteplayer")
    public String deletePlayer(@RequestParam(value = "id",defaultValue = "-1") int id){
//        try(
               service.delete(id);
               return "success";
//            return String.format("%-8s : %-5d Successfully deleted \n", "Player", id);
//        else
//            return String.format("%-8s : %-5d Not Found \n", "Player", id);
    }

}