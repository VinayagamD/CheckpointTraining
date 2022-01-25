package com.checkpt.java8.demo.basics.interfaces;

import com.checkpt.java8.demo.data.Post;

import java.util.List;

public interface PostsHandler {

    List<Post> handlePosts(String data);
}
