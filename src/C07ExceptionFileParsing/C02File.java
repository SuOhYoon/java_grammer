package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02File {
    public static void main(String[] args) throws IOException {
//        콘솔창에 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);

//        파일에서 읽기
        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test.txt"));
        String line = br2.readLine();
        while(line!=null){
            System.out.println(line);
            line = br2.readLine();
        }

//        파일에서 일기 : NIO패키지
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt";
    }
}
