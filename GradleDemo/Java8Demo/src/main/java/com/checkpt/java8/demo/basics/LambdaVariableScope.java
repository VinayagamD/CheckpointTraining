package com.checkpt.java8.demo.basics;

import com.checkpt.java8.demo.basics.interfaces.PostsHandler;
import com.checkpt.java8.demo.basics.interfaces.VariableScope;
import com.checkpt.java8.demo.data.Post;
import com.checkpt.java8.demo.data.Student;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaVariableScope {
    Student student = new Student();

    public static void main(String[] args) throws IOException, InterruptedException {
        final Student student = new Student();
        System.out.println(student);
        VariableScope scope = (data) ->{
            student.setName("Test Name");
        };
//        student = new Student();
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts")
                .build();

        OkHttpClient okHttpClient = new OkHttpClient();
        Call call = okHttpClient.newCall(request);
        Response response = call.execute();


       /* HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create())
                .build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response  = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        PostsHandler postsHandler  = (json) -> {
            JSONArray jsonArray = new JSONArray(json);
            return jsonArray.toList().stream().map(data -> {
                JSONObject jsonObject = new JSONObject(data);
                return Post.fromJson(jsonObject);
            }).collect(Collectors.toList());
        };
        List<Post>  posts = postsHandler.handlePosts(response.body()) ;*/

    }

    private void testVariableScope(){
        VariableScope scope = (data) ->{
           student.setName(data.getName());
        };

        student = new Student();
    }
}
