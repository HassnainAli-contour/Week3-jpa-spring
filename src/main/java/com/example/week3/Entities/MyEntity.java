package com.example.week3.Entities;

import org.springframework.beans.factory.annotation.Value;

public class MyEntity implements Comparable<MyEntity>
    {
        //final int id2=2;
        @Value("$default.entity.id")
        private long id;
        @Value("$default.entity.name")
        String name;

        public MyEntity() {
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }


        @Override
        public int compareTo(MyEntity o)
        {
            return o.getId()>this.id?1:-1;
        }
    }
