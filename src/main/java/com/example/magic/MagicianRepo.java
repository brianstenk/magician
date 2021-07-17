package com.example.magic;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicianRepo extends MongoRepository<Magician, ObjectId> {
}
