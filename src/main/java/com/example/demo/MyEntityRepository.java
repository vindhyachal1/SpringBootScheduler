package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityRepository extends MongoRepository<MyEntity, String> {
}
