package C07ExceptionFileParsing;

import java.util.Scanner;

public class C01Exception {
    public static void main(String[] args) {
//        일반적인 예외처리 방식
        try {
            System.out.println("나눗셈 프로그램입니다.");
            Scanner sc = new Scanner(System.in);
            System.out.println("분자를 입력해주세요.");
            int head = Integer.parseInt(sc.nextLine());
            System.out.println("분모를 입력해주세요.");
            int tail = Integer.parseInt(sc.nextLine());
            int result = head/tail; // 여기서 예외 발생시 try내부의 하단의 코드는 실행되지 않음
            System.out.println("두 수를 나눈 결과 값은 " + result);
//            catch를 통해 예상되는 예외클래스를 분기처리한다.
        } catch(ArithmeticException e) {
            System.out.println("0으로 나누시면 안됩니다.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("문자를 입력하시면 안됩니다.");
            e.printStackTrace();    
        }
    }
}
