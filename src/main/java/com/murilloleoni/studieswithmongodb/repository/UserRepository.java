package com.murilloleoni.studieswithmongodb.repository;

import com.murilloleoni.studieswithmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
