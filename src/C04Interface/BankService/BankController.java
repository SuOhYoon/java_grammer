package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);

        while(true){
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            System.out.println("사용하는 은행을 선택해주세요. 1.카카오페이 2.토스페이");
            String bank = sc.nextLine();
            BankService bs;

            if(bank.equals("1")){
                bs = new BankKakaoService();
            } else {
                bs = new BankTossService();
            }

            if(serviceNumber.equals("1")){
                System.out.println("입금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                bs.deposit(money, ba);
                System.out.println("입금이 완료되었습니다.");
            } else {
                System.out.println("출금하실 금액을 입력해주세요");
                long money  = Long.parseLong(sc.nextLine());
                bs.withdraw(money, ba);
                System.out.println("출금이 완료되었습니다.");
            }
        }
    }
}
