package com.wesi4a.fullstackAplication.repository;

import com.wesi4a.fullstackAplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
