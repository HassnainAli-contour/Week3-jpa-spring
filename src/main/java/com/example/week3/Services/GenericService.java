package com.example.week3.Services;

import com.example.week3.Entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class GenericService<T>{
    JpaRepository<T,Long> repository;
//    @Autowired
//    GenericService(JpaRepository<T,Long> repository)
//    {
//        this.repository = repository;
//    }
    public List<T> getAll(){

        return  repository.findAll();
    }
    public T get(long id)
    {
        return repository.findById(id).get();
    }
    public void add(T t){

        repository.save(t);
    };
    public void delete(long id ){
        repository.deleteById(id);
    }

    public void update(T t) {

       // T temp = repository.findById(t.getId()).get();
    }

}
