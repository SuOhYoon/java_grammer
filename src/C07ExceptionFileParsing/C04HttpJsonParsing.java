package C07ExceptionFileParsing;

import java.net.http.HttpClient;

public class C04HttpJsonParsing {
    public static void main(String[] args) {
//        외부데이터(api) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
        HttpClient client = HttpClient.newHttpClient();
    }
}
