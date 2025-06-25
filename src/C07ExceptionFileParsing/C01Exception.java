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
            int result = head/tail;
            System.out.println("두 수를 나눈 결과 값은 " + result);
//            catch를 통해 예상되는 예외클래스를 분기처리한다.
        } catch(ArithmeticException e) {

        }
        System.out.println("두 수를 나눈 결과 값은 : " + result);
    }
}
