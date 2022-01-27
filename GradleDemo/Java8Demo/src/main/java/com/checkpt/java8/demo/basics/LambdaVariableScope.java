package com.checkpt.java8.demo.basics;

import com.checkpt.java8.demo.basics.interfaces.PostsHandler;
import com.checkpt.java8.demo.basics.interfaces.VariableScope;
import com.checkpt.java8.demo.data.Post;
import com.checkpt.java8.demo.data.Student;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class LambdaVariableScope {
    Student student = new Student();

    public static void main(String[] args) throws IOException, InterruptedException {
        final Student student = new Student();
        System.out.println(student);
        VariableScope scope = (data) ->{
            student.setName("Test Name");
        };
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response  = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        PostsHandler postsHandler  = (json) -> {
            JSONArray jsonArray = new JSONArray(json);
            return StreamSupport.stream(jsonArray.spliterator(),false)
                    .map(e -> Post.fromJson((JSONObject) e)).collect(Collectors.toList());
        };
        List<Post>  posts = postsHandler.handlePosts(response.body()) ;
        posts.forEach(System.out::println);

    }

    private void testVariableScope(){
        VariableScope scope = (data) ->{
           student.setName(data.getName());
        };

        student = new Student();
    }
}
