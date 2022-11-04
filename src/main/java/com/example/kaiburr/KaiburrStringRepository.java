package com.example.kaiburr;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KaiburrStringRepository  extends MongoRepository<KaiburrModel , String> {
    KaiburrModel findByName(String name);

}
