package com.checkpt.java8.demo.data;

import org.json.JSONObject;

public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public static Post fromJson(JSONObject jsonObject) {
        Post post = new Post();
        post.setId(jsonObject.getInt("id"));
        post.setUserId(jsonObject.getInt("userId"));
        post.setTitle(jsonObject.getString("title"));
        post.setBody(jsonObject.getString("body"));
        return post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
