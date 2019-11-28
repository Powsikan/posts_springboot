package com.powsikan.posts.controller;

import com.powsikan.posts.entity.Post;
import com.powsikan.posts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public List<Post> getAll(){
       return postService.getAll();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost( @PathVariable int id){
      return   postService.getPost(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/posts")
    public void addPost(@RequestBody Post listElement){
        postService.addPost(listElement);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/posts")
    public void updatePost(@RequestBody Post post){
        postService.addPost(post);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
    public void deletePost(@PathVariable int id){
        postService.deletePost(id);

    }

}
