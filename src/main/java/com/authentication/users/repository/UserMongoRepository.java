package com.authentication.users.repository;

import com.authentication.users.models.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<UserEntity, Long> {
}
