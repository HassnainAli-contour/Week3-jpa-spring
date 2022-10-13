package com.example.week3.Services;

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
    public boolean add(T t){
        return (repository.save(t)==null);
    };
    public void delete(long id ){
        repository.deleteById(id);
    }

    public void update(T t) {

       // T temp = repository.findById(t.getId()).get();
    }

}
