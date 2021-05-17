package com.example.academy.springboot.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {   //  DAO

}
