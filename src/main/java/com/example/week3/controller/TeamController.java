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
        return    service.save(team);
        //   System.out.println(player.getRuns());
        //   return String.format("%-20s  %-5d", player.getName(),player.getId());
    }
    @PutMapping("/updateteam")
    public String updateTeam(@RequestBody Team team)
    {
        return service.update(team);
    }

    @DeleteMapping("/deleteteam")
    public String deleteTeam(@RequestParam(value = "id",defaultValue = "-1") int id){
        if(service.delete(id))
            return String.format("%-8s : %-5d Successfully deleted \n", "Team", id);
        else
            return String.format("%-8s : %-5d Not Found \n", "Team", id);
    }
}
