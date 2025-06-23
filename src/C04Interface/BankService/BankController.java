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
            
            if(serviceNumber.equals("1")){
                System.out.println("입금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
                BankService bs = new BankService();
                bs.deposit(money, ba);
            } else {
                System.out.println("출금하실 금액을 입력해주세요");
                long money  = Long.parseLong(sc.nextLine());
                
            }
        }
    }
}
