// 흐름 제어문 - if 문의 조건
package step05;

public class Exam01_3 {
    public static void main(String[] args){
        int age = 17;
        
        // if 문의 조건은 반드시 boolean 데이터여야 한다.
        if (true)
        System.out.println("true이다.");
        if (false)
        System.out.println("false이다.");
        if (10 < 8 + 5)
        System.out.println("true이다.");
    }
}