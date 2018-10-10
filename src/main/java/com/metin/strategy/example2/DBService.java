package com.metin.strategy.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DBService {

    @Autowired
    @Qualifier("mySQL")
    private DB db;

    public void select() {
        db.select();
    }

    public void update() {
        db.update();
    }

    public void delete() {
        db.delete();
    }

    public void insert() {
        db.insert();
    }
}
