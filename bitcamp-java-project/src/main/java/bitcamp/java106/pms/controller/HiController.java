// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

//@Component("calc")
public class HiController implements Controller {
    Scanner keyScan;
    
    public HiController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        System.out.println("식을 입력하세요");
        String s =keyScan.nextLine();
        String[] arr= s.split(" ");
        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);
        
        switch(op) {
        case "+":
            System.out.printf("%d + %d = %d",a,b,a+b);
            break;
        case "-":
            System.out.printf("%d - %d = %d",a,b,a-b);
            break;
        case "*":
            System.out.printf("%d * %d = %d",a,b,a*b);
            break;
        case "/":
            System.out.printf("%d / %d = %d",a,b,a/b);
            break;
        default :
                System.out.println("잘못된 연산식입니다");
            
        }
    }

}

//ver 26 - HiController 클래스를 한 개의 명령을 처리하는 클래스로 변경.
//ver 23 - 유지보수 테스트를 위해 임시로 만듦.