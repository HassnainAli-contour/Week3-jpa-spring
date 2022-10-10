package com.example.week3.controller;

import com.example.week3.Entities.Match;
import com.example.week3.Services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MatchController{

    @Autowired
    private MatchService service ;

    MatchController(MatchService service)
    {
        this.service = service;
    }

    @GetMapping("/matches")
    public List<Match> getMatches()
    {
        return service.getAll();
    }

    @GetMapping("getmatch")
    public Match getMatch(@RequestParam(value = "id",defaultValue = "-1") int id)
    {
        Match p =(Match) service.get(id);
        return p;           //!=null?p : null;
    }
    @PostMapping("/addmatch")
    public String addMatch(@RequestBody Match Match)
    {
        return    service.save(Match);
        //   System.out.println(Match.getRuns());
        //   return String.format("%-20s  %-5d", Match.getName(),Match.getId());
    }
    @PutMapping("/updatematch")
    public String updateMatch(@RequestBody Match Match)
    {
        return service.update(Match);
    }

    @DeleteMapping("/deletematch")
    public String deleteMatch(@RequestParam(value = "id",defaultValue = "-1") int id){
        if(service.delete(id))
            return String.format("%-8s : %-5d Successfully deleted \n", "Match", id);
        else
            return String.format("%-8s : %-5d Not Found \n", "Match", id);
    }

}
