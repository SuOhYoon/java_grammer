package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식
////        예외처리 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("나눗셈 프로그램입니다.");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("분자를 입력해주세요");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
////            double result = (double) head / tail;
////            System.out.println("두 수를 나눈 결과값은 " + result);
//            int result1 = head / tail;
//            System.out.println("두 수를 나눈 결과값은 " + result1);
//        } catch (ArithmeticException e) { // 예외처리를 분기 처리
//            System.out.println("0으로 나눌 수 없습니다.");
////            아래와 같은 방식으로 시스템 로그를 기록.
//            e.printStackTrace();
//            System.out.println(e.getMessage()); // 메세지만 간단히 출력
//        } catch (NumberFormatException e) {
//            System.out.println("문자를 입력할 수 없습니다.");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("예상치 않은 오류가 발생했습니다.");
//            e.printStackTrace();
//        } finally {
////            예외가 발생하던 아니던 무조건 실행시키고 싶을때 사용
//            System.out.println("무조건 실행되는 문구입니다.");
//        }
//
//        System.out.println("hello World");
        System.out.println("로그인을 위한 비밀번호 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        login(input);

//        checked exception 은 예외처리를 위임받게 되면, 반드시 예외처리를 하거나, 다시 throws 해야함.
        
//        넘겨 받아서 처리하는 경우
        try {
            login2(input);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("환영합니다.");
    }

    //    throws 키워드를 통해 예외를 위임
//    다만, unchecked 예외에서는 예외처리가 강제가 이니므로, throws가 큰 의미는 없음.
//    그러나, checked 예외에서는 예외처리가 강제되기 때문에, throws가 의미가 있음.
    static boolean login(String password) throws IllegalArgumentException {
        if (password.equals("1234")) {
            return true;
        } else if(password == null) {
//            예외를 강제 발생시킴으로서 이시점에 해당 메서드 강제 종료
//            예외는 기본적으로 해당메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 잘못입력하셨습니다.");
        } else {
            throw new NoSuchElementException("그러한 비밀번호 없습니다.");
        }
    }

    static boolean login2(String password) throws SQLException {
        if (password.equals("1234")) {
            return true;
        } else {
//            checked exception은 예외 처리가 강제
//            해당 메서드내에서 예외처리를 하든, 아니면 명시적으로 throws를 통해 호출 메서드 쪽에 위임.

////            직접 하는 경우
//            try {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                br.readLine();
//            } catch (Exception e) {
//
//            }


            throw new SQLException("비밀번호를 잘못입력하셨습니다.");
        }
    }
}