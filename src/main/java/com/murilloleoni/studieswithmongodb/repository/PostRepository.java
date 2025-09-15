package com.murilloleoni.studieswithmongodb.repository;

import com.murilloleoni.studieswithmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
