package com.powsikan.posts.service;

import com.powsikan.posts.entity.Post;
import com.powsikan.posts.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll() {
        List<Post> list = new ArrayList<>();
        for (Post post : postRepository.findAll()) {
            list.add(post);
        }
        return list;
    }

    public Post getPost(int id) {
        return postRepository.findById(id).get();
    }

    public void addPost(Post listElement){
        postRepository.save(listElement);
    }

    public void updatePost(Post post){
        postRepository.save(post);
    }
    public void deletePost(int id){
        postRepository.deleteById(id);
    }
}
