package com.example.springSecurity.repository;

import com.example.springSecurity.model.ERole;
import com.example.springSecurity.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
