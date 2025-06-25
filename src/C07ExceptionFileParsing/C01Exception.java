package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
//        일반적인 예외처리 방식 : 예외가 발생시에 프로그램이 중지되지 않도록 하는 프로그래밍.
//        try {
//            System.out.println("나눗셈 프로그램입니다.");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head/tail; // 여기서 예외 발생시 try내부의 하단의 코드는 실행되지 않음
//            System.out.println("두 수를 나눈 결과 값은 " + result);
////            catch를 통해 예상되는 예외클래스를 분기처리한다.
//        } catch(ArithmeticException e) {
//            System.out.println("0으로 나누시면 안됩니다.");
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        } catch (NumberFormatException e){
//            System.out.println("문자를 입력하시면 안됩니다.");
//            e.printStackTrace();
////            Exception은 모든 예외의 초상 클래스
//        } catch (Exception e){
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//        } finally {
//            System.out.println("무조건 실행되는 문구입니다.");
//        }

//        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        login(input);
        System.out.println("환영합니다.");

        login2()
    }

//    throws키워드를 통해 예외를 위임.
//    다만, unchecked예외에서는 예외처리가 강제가 아니므로, throws가 큰의미는 없음.
    static boolean login(String password) throws IllegalArgumentException{
        if(password.equals("1234")){
            return true;
        } else {
//            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
//            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 잘못 입력하셨습니다.");
        }
    }

    static boolean login2(String password) {
        if(password.equals("1234")){
            return true;
        } else {
            try {
//            checked exception은 예외처리가 강제
//            해당 메서드내에서 예외처리를 하든, 아니면 명시적으로 throw를 통해 호출 메서드쪽에 위임.
                throw new SQLException("비밀번호를 잘못 입력하셨습니다.");
            } catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
