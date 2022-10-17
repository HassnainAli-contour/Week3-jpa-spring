package com.example.week3.controller;

import com.example.week3.Entities.Team;
import com.example.week3.Services.TeamService;
import com.example.week3.dto.TeamDTO;
import com.sun.istack.NotNull;
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
    public List<TeamDTO> getTeams()
    {
        return service.getAllwithPlayers();
    }

    @PostMapping("/addteam")
    public Team addTeam(@RequestBody Team team)
    {
        service.add(team);
        return team;

        //   return String.format("%-20s  %-5d", player.getName(),player.getId());
    }

    @GetMapping("getteam")
    public TeamDTO getTeam(@NotNull @RequestParam(value = "id") long id)
    {
        return service.getTeamWithPlayers(id);            //!=null?p : null;
    }
    @PutMapping("/updateteam")
    public String updateTeam(@RequestBody Team team)
    {
        service.update(team);
        return "success";
    }

    @DeleteMapping("/deleteteam")
    public String deleteTeam(@NotNull @RequestParam(value = "id") long id){
        service.delete(id);
        return "success";

    }
}
