package C07ExceptionFileParsing;

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
        System.out.println("로그인을 위한 비밀번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(login(input)){

        }


    }

    static boolean login(String password){
        if(password.equals("1234")){
            return true;
        } else {
            return false;
        }
    }
}
