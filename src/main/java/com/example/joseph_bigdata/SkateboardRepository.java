package com.example.joseph_bigdata;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkateboardRepository extends MongoRepository<Skateboard, Integer> {
}
