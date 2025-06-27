package C07ExceptionFileParsing;

import java.net.http.HttpClient;

public class C04HttpJsonParsing {
    public static void main(String[] args) {
//        외부데이터(api) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
//        HttpClient는 자바의 내장클래스로서 별도의 역직렬화, 직렬화 작업이 필요
        HttpClient client = HttpClient.newHttpClient();
    }
}
