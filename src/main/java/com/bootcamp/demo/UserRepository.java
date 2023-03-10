package com.bootcamp.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
