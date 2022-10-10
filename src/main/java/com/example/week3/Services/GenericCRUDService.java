package com.example.week3.Services;

import com.example.week3.Entities.MyEntity;
import com.example.week3.repository.GenericDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericCRUDService<T extends MyEntity>{

    GenericDAOImpl<T> genericDAO;
    GenericCRUDService(){
        genericDAO = new GenericDAOImpl<T>();
    }

    public List getAll(){
        return genericDAO.getAll();
    }
    public T get(int id){
        return (T)genericDAO.get(id);
    }
    public String save(T t){
        if(genericDAO.add(t))
            return String.format("%-8s : %-5d Added successfully", t.getClass().getSimpleName(), t.getId());
        else
            return String.format("%-8s : %-5d already exists", t.getClass().getSimpleName(), t.getId());
    }
    public String update(T t){
            if (genericDAO.update(t))
             return String.format("%-8s : %-5d Successfully updated \n", t.getClass().getSimpleName(), t.getId());
            else
                return String.format("%-8s : %-5d Not Found \n", t.getClass().getSimpleName(), t.getId());
    }
    public boolean delete(int id){

        return  genericDAO.delete(id);
    }
}
