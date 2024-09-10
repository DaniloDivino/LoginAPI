package com.api.loginApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.loginApi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
