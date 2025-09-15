package ch1;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        boolean run = true;      
        int balance = 0;
        Scanner sc = new Scanner(System.in);
 
        while(run) {
            System.out.println("-----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.println("선택> ");

            int bank = sc.nextInt();
            
            switch (bank) {
				case 1: System.out.println("입금액을 입력하세요");
					int input = sc.nextInt();
					balance += input;
					System.out.println(balance + "원 입금되었습니다.");
					break;
				case 2: 
					System.out.println("출금액을 입력하세요.");
					int withdraw = sc.nextInt();
					if(withdraw>balance) {System.out.println("잔액이 부족합니다.");}
					else {balance -= withdraw;
					System.out.println(withdraw + "원 출금되었습니다.");
					break;
					}
				case 3: 
					System.out.println("잔고: " + balance + "원"); 
					break;
				case 4: run = false; break;
				default: System.out.println("잘못된 입력입니다.");
			} 
        
        }
        
        System.out.println("프로그램 종료");    
    }
}