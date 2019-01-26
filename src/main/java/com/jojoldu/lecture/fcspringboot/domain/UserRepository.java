package com.jojoldu.lecture.fcspringboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * Created by jojoldu@gmail.com on 2019-01-26
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
