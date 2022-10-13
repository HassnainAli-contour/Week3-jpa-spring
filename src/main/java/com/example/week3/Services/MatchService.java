package com.example.week3.Services;

import com.example.week3.Entities.Match;
import com.example.week3.repository.MatchJPARep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService extends GenericService<Match>{
    @Autowired
    MatchService(MatchJPARep rep){
        this.repository = rep;
    }
}
