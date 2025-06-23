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
            System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
            
            String serviceNumber = sc.nextLine();
            BankService bs;
            
            if(serviceNumber.equals("1")){

                System.out.println("입금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                String bank = sc.nextLine();
                if(bank.equals("1")){
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);
                    System.out.println("입금이 완료되었습니다.");
                } else {
                    bs = new BankTossService();
                    bs.deposit(money, ba);
                    System.out.println("입금이 완료되었습니다.");
                }
            } else {
                System.out.println("입금방식을 선택해주세요. 1.카카오페이 2.토스페이");
                System.out.println("출금하실 금액을 입력해주세요");
                long money  = Long.parseLong(sc.nextLine());
                String bank = sc.nextLine();
                if(bank.equals("1")){
                    bs = new BankKakaoService();
                    bs.withdraw(money, ba);
                } else {
                    bs = new BankTossService();
                    bs.withdraw(money, ba);
                }
            }
        }
    }
}
