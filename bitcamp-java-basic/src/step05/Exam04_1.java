// 흐름제어문 - for 반복문

package step05;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class Exam04_1 {
    public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감식) 문장        
    // for (변수선언 및 초기화; 조건; 증감식) {문장1',문장2; ...}

    for (int i = 1; i <= 5; i++)
    System.out.println(i);
    System.out.println("-----------------");
    for (int i = 1; i <=5;) {
        System.out.println(i);
        i++;
    }
    int i = 1;
    for (;;) {
        if(i > 5)
        break;
        System.out.println(i);
        i++;
    }
    }
}