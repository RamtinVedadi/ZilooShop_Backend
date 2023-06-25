package com.ziloo.repository;

import com.ziloo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface UserRepository extends JpaRepository<User, UUID> {
}
