package com.example.week3.Services;

import com.example.week3.Entities.Player;
import com.example.week3.Entities.Team;
import com.example.week3.dto.TeamDTO;
import com.example.week3.repository.TeamJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService extends GenericService<Team>{

    @Autowired
    TeamService(TeamJPARep repository){
        this.repository = repository;
    }

    @Override
    public boolean delete(long id){
        Team team = repository.findById(id).get();
        if(team==null){
            return false;
        }
        //repository.deleteById(team);
        repository.deleteById(id);
        return true;
    }

    public List<TeamDTO> getAllwithPlayers(){
       List<Team> t=repository.findAll();
       List<TeamDTO> tdo= new ArrayList<TeamDTO>();
       for (Team team : t){
           tdo.add(new TeamDTO(team,((TeamJPARep)repository).getAllWithPlayers(team)));
       }
       return  tdo;
    }

    public TeamDTO getTeamWithPlayers(long id)
    {
        Team t = repository.findById(id).get();
        return new TeamDTO(t,((TeamJPARep)repository).getAllWithPlayers(t));
    }
}
