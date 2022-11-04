package com.example.kaiburr;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KaiburrRepository extends MongoRepository<KaiburrModel , Integer> {
    List<KaiburrModel> findByName(String name);
}


