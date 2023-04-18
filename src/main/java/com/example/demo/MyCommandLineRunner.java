package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private MyEntityRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Insert 50 records
//        for (int i = 1; i <= 50; i++) {
//            MyEntity entity = new MyEntity();
//            entity.setAccount_id("Field 1 Value " + i);
//            entity.setLimit("Field 2 Value " + i);
//            List<String> arrayField = new ArrayList<>();
//            arrayField.add("Array Value 1 for Entity " + i);
//            arrayField.add("Array Value 2 for Entity " + i);
//            entity.setProducts(arrayField);
//            repository.save(entity);
//        }
        for (int i = 1; i <= 50; i++) {
            MyEntity entity = new MyEntity();
            entity.setAccount_id("Field 1 Value " + i);
            entity.setLimit("Field 2 Value " + i);
            List<String> arrayField = new ArrayList<>();
            arrayField.add("Array Value 1 for Entity " + i);
            arrayField.add("Array Value 2 for Entity " + i);
            entity.setProducts(arrayField);
            repository.insert(entity);
        }
    }

//    @Autowired
//    private MyEntityRepository repository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Insert 50 records
//        for (int i = 1; i <= 50; i++) {
//            MyEntity entity = new MyEntity();
//            entity.setName("Entity " + i);
//            repository.save(entity);
//        }

    // Delete the 50 records
//        for (int i = 1; i <= 50; i++) {
//            repository.deleteById("documentId" + i);
//        }
//    }
}


