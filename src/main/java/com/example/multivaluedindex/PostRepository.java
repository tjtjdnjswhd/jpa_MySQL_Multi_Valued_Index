package com.example.multivaluedindex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query(value = "SELECT p.id, p.tags FROM Post p WHERE :tag MEMBER OF (p.tags)", nativeQuery = true)
    List<Post> findByTag(@Param("tag") String tag);
}
