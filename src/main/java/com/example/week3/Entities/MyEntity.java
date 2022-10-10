package com.example.week3.Entities;

import org.springframework.beans.factory.annotation.Value;

public class MyEntity implements Comparable<MyEntity>,Entity
    {
        //final int id2=2;
        @Value("$default.entity.id")
        private int id;
        @Value("$default.entity.name")
        String name;
        MyEntity(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
        @Override
        public String getName() {
            return name;
        }
        @Override
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public int getId() {
            return this.id;
        }
        @Override
        public void setId(int id) {
            this.id = id;
        }


        @Override
        public int compareTo(MyEntity o)
        {
            return o.getId()>this.id?1:-1;
        }
    }
