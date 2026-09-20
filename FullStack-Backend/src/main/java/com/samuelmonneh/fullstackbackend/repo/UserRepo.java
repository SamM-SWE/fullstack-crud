package com.samuelmonneh.fullstackbackend.repo;

import com.samuelmonneh.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
