package com.example.week3.repository;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.example.week3.Entities.MyEntity;

import java.util.List;

public interface GenericDAO<T extends MyEntity> {
    List<T> getAll();

    T get(int var1);

    boolean add(T var1);

    boolean update(T var1);

    boolean delete(int var1);
}
