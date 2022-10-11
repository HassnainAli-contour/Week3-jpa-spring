package com.example.week3.controller;

import com.example.week3.Entities.Team;
import com.example.week3.Services.GenericCRUDService;
import com.example.week3.Services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TeamController {
    private TeamService service ;

    @Autowired
    TeamController(TeamService service)
    {
        this.service = service;
    }

    @GetMapping("/teams")
    public List<Team> getTeams()
    {
        return service.getAll();
    }

    @PostMapping("/addteam")
    public String addTeam(@RequestBody Team team)
    {
        service.add(team);
        return "success";
        //   System.out.println(player.getRuns());
        //   return String.format("%-20s  %-5d", player.getName(),player.getId());
    }
    @PutMapping("/updateteam")
    public String updateTeam(@RequestBody Team team)
    {
        service.update(team);
        return "success";
    }

    @DeleteMapping("/deleteteam")
    public String deleteTeam(@RequestParam(value = "id",defaultValue = "-1") int id){
        service.delete(id);
        return "success";

    }
}
