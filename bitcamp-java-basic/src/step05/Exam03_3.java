// 흐름 제어문 - 중복 반복문 탈출

package step05;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class Exam03_3 {
    public static void main(String[] args) {
       int x=2, y=1;
        // 5 * 5 까지만 출력하라
        // 라벨명 : 반복문 1 () { 반복문 {break 라벨명;} }
    myloop:
    while (x <= 9) {
        while(y <= 9){
              System.out.printf("%d * %d = %d\n",x,y,x*y);
              if (x == 5 && y == 5)
                break myloop ;
              y++;
          }
          System.out.println();
          x++;
          y=1;
       }

    }
}