package com.example.week3.controller;

import com.example.week3.Entities.Tournament;
import com.example.week3.Services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TournamentController {


    @Autowired
    private TournamentService service ;
//    GenericDAOImpl manageTournament;

    TournamentController(TournamentService service)
    {
        this.service = service;
    }

    @GetMapping("/tournaments")
    public List<Tournament> getTournamentes()
    {
        return service.getAll();
    }

    @GetMapping("gettournament")
    public Tournament getTournament(@RequestParam(value = "id",defaultValue = "-1") int id)
    {
        return service.get(id);            //!=null?p : null;
    }
    @PostMapping("/addtournament")
    public Tournament addTournament(@RequestBody Tournament Tournament)
    {
        service.add(Tournament);
        return Tournament;
    }
    @PutMapping("/updatetournament")
    public String updateTournament(@RequestBody Tournament Tournament)
    {
        service.update(Tournament);
        return "success ";
    }

    @DeleteMapping("/deleteTournament")
    public String deleteTournament(@RequestParam(value = "id",defaultValue = "-1") int id){
//        try(
        service.delete(id);
        return "success";
//            return String.format("%-8s : %-5d Successfully deleted \n", "Tournament", id);
//        else
//            return String.format("%-8s : %-5d Not Found \n", "Tournament", id);
    }

}