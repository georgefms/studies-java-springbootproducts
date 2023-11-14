package com.study.georgefms.springbootproducts.repositories;

import com.study.georgefms.springbootproducts.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, String> {
    UserDetails findByLogin(String login);
}
