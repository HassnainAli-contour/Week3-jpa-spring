package com.example.week3.controller;

import com.example.week3.Entities.Match;
import com.example.week3.Services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatchController {


    @Autowired
    private MatchService service ;
//    GenericDAOImpl manageMatch;

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
        return service.get(id);            //!=null?p : null;
    }
    @PostMapping("/addmatch")
    public String addMatch(@RequestBody Match Match)
    {
        service.add(Match);
        return "success ";
    }
    @PutMapping("/updatematch")
    public String updateMatch(@RequestBody Match Match)
    {
        service.update(Match);
        return "success ";
    }

    @DeleteMapping("/deletematch")
    public String deleteMatch(@RequestParam(value = "id",defaultValue = "-1") int id){
//        try(
        service.delete(id);
        return "success";
//            return String.format("%-8s : %-5d Successfully deleted \n", "Match", id);
//        else
//            return String.format("%-8s : %-5d Not Found \n", "Match", id);
    }

}