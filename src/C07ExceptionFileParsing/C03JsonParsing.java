package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03JsonParsing {
    public static void main(String[] args) {
//        ObjectMapper : json 직렬화 역직렬화를 위한 라이브러리
        ObjectMapper o1 = new ObjectMapper();
//        사용법 : 클래스명 객체명 = o1.readValue(문자열, 클래스명);
                Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt");
//        readString : 문자열전체를 통째로 read
        String st1 = Files.readString(filePath);
    }
}
