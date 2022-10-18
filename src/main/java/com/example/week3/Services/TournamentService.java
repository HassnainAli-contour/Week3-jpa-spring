package com.example.week3.Services;

import com.example.week3.Entities.Tournament;
import com.example.week3.repository.TournamentJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentService extends GenericService<Tournament>{

    @Autowired
    TournamentService(TournamentJPARep rep){
        this.repository = rep;
    }
}
