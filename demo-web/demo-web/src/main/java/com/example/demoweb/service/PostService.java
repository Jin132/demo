package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Пара в 8 утра -_-"));
        posts.add(new Post("Мяу"));
        posts.add(new Post("Я - сова"));
        return posts;
    }
}
