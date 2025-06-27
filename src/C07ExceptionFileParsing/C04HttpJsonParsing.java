package C07ExceptionFileParsing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class C04HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
//        외부데이터(api) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
//        HttpClient는 자바의 내장클래스로서 별도의 역직렬화, 직렬화 작업이 필요
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();
        System.out.println(postString);
    }
}

class Post{
    long userId;
    long id;
    String id;
    String body;
}