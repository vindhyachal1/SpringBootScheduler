//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class MongoComponent {
//
//    private final MongoTemplate mongoTemplate;
//
//    @Autowired
//    public MongoComponent(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//    }
//
//    @Scheduled(cron = "* * * * * *")
//    public void doTask() {
//        List<MyDocument> documents = new ArrayList<>();
//        documents.add(new MyDocument("John"));
//        documents.add(new MyDocument("Mary"));
//        documents.add(new MyDocument("Tom"));
//        mongoTemplate.insert(documents, "accounts");
//    }
//
//    private static class MyDocument {
//
//        private String name;
//
//        public MyDocument(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//}
//
