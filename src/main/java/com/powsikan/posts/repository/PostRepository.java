package com.powsikan.posts.repository;

import com.powsikan.posts.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Integer> {
}
