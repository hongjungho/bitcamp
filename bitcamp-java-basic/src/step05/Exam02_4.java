// 흐름 제어문 - switch 문법

package step05;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

// 상수를 좀 더 조직적으로 관리하는 방법
// => enum을 사용하여 상수를 정의한다.
enum Level {
    GUEST2,MEMBER2,ADMIN2
}
public class Exam02_4 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
       System.out.print("사용자 레벨?");
       int level = keyScan.nextInt();
        // 상수를 사용하지 않았을때
        // = > 값의 의미를 주석으로 달아야만 다른개발자가 이해할수 있다
       switch (level) {
            case 0: //손님
                System.out.println("조회가능");
                break;
            case 1: //일반회원
                System.out.println("글작성 가능");
                break;
            case 2: //관리자
                System.out.println("다른회원글 변경,삭제가능");
                break;
        }
        //상수를 이용하면 주석없이 바로 이해할 수 있다.
        final int GUEST = 0, MEMBER = 1, ADMIN =2;
        switch (level) {
            case GUEST: 
                System.out.println("조회가능");
                break;
            case MEMBER:
                System.out.println("글작성 가능");
                break;
            case ADMIN: 
                System.out.println("다른회원글 변경,삭제가능");
                break;
        }

        // enum으로 정의도니 상수를 사용하려면
        // enum 타입의 변수를 선언해야 한다.
        // enum을 사용하는 주된 이유는?

        Level userLevel = Level.MEMBER2;
        switch (userLevel) {
            case GUEST2: 
                System.out.println("조회가능");
                break;
            case MEMBER2:
                System.out.println("글작성 가능");
                break;
            case ADMIN2: 
                System.out.println("다른회원글 변경,삭제가능");
                break;
        }
    }
}

//if vs switch
// =>복잡한 조건으로 프로그램 흐름을 제어해야 하는 상황이라면 
// if 문을 사용하라!