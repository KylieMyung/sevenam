package com.sevenam.sad.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//----------------------------------------
//-- UserRepository.java
//-- OAuth 유저 관련 Repository
//----------------------------------------
public interface UserRepository extends JpaRepository<User, Long> {

    //---------------
    //-- email을 통해 가입된 유저인지 조회
    //---------------
    Optional<User> findByEmail(String email);
}
