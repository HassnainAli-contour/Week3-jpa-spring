package com.example.week3.repository;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.example.week3.Entities.MyEntity;
import com.example.week3.Services.GenericCRUDService;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class GenericDAOImpl<T extends MyEntity> implements GenericDAO<T> {
    private List<T> entities = new LinkedList();

    public GenericDAOImpl(){
        entities=new LinkedList<T>();
    }

    public List<T> getAll() {
        return new LinkedList(this.entities);
    }

    public T get(int id) {
        return (this.entities.stream().filter((a) -> {
            return a.getId() == id;
        }).findFirst().orElse(null));
    }

    public boolean add(T t) {
        if (this.entities.stream().filter((a) -> {
            return a == t || a.getId() == t.getId();
        }).findFirst().orElse(null) == null) {
            this.entities.add(t);
            return true;
        } else {
            return false;
            //System.out.printf("-8s : %-5d already exists", t.getClass().getSimpleName(), t.getId());
        }

    }

    public boolean update(T t) {
        T temp = this.entities.stream().filter((a) -> {
            return a.getId() == t.getId();
        }).findFirst().orElse(null);
        if (temp != null) {
            this.entities.set(this.entities.indexOf(temp), t);
            return true;
            //String.format("%-8s : %-5d Successfully updated \n", temp.getClass().getSimpleName(), temp.getId());
        } else {
            return false;
            //String.format("%-8s : %-5d Not Found \n", t.getClass().getSimpleName(), t.getId());
        }

    }

    public boolean delete(int id) {
        T temp = this.entities.stream().filter((t) -> {
            return t.getId() == id;
        }).findFirst().orElse(null);

        return this.entities.remove(temp);
    }
}

