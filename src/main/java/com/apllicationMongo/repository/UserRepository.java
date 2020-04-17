package com.apllicationMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apllicationMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
