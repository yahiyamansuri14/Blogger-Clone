package io.marsab.minorproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.marsab.minorproject.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
