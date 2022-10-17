package com.example.week3.Services;

import com.example.week3.Entities.MyEntity;
import org.apache.catalina.mapper.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class GenericService<T extends MyEntity>{
    Mapper mapper = new Mapper();
    JpaRepository<T,Long> repository;
   public List<T> getAll(){

        return  repository.findAll();
    }
    public T get(long id)
    {
        return repository.findById(id).get();
    }
    public boolean add(T t){
        System.out.println("here");
        System.out.println("Object is "+t.getClass().getSimpleName());
        repository.save(t);
        return true;
    };
    public boolean delete(long id ){
        repository.deleteById(id);return true;
    }

    public T update(T t) {
        return repository.save(t);
    }
}
