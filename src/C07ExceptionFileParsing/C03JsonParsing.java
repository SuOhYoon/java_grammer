package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class C03JsonParsing {
    public static void main(String[] args) throws IOException {
//        ObjectMapper : json 직렬화 역직렬화를 위한 라이브러리
        ObjectMapper o1 = new ObjectMapper();
//        사용법 : 클래스명 객체명 = o1.readValue(문자열, 클래스명);
        Path filePath = Paths.get("src/C07ExceptionFileParsing/myjson1.json");
        String st1 = Files.readString(filePath);
        Map<String, String> myMap = o1.readValue(st1, Map.class);
        System.out.println(myMap.get("name"));
        System.out.println(myMap);

        Student s1 = o1.readValue(st1, Student.class);
    }
}

class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;

    public Student() {
    }

    public Student(int id, String name, String classNumber, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
