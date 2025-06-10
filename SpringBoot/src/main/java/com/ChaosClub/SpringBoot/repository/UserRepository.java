package com.ChaosClub.SpringBoot.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //Spring Data JPA will provide implementation for basic DB query
    // we can write our own complex DB queries
}
