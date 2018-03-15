// 흐름 제어문 - switch 문법
package step05;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class Exam02_3 {
    public static void main(String[] args) {
        // switch (값) {}
        // 값으로 가능한 데이터 타입은?
        // => 정수(byte,short,int,long,char),문자열,Enum 타입
        byte b = 2;    
        switch (b) {
            case 1:
            case 2:
            default:
        }
 
        short s = 2;    
        switch (s) {
            case 1:
            case 2:
            default:
        }

        int i = 2;    
        switch (i) {
            case 1:
            case 2:
            default:
        }
        // 컴파일 오류 (4바이트 값 까지가능)
        /*
        long l = 2;
        switch (l) {
            case 1:
            case 2:
            default:
        }
        */
        char c = 'A'; // A 문자의 유니코드 값 0x41(65)을 c에 저장한다.    
        switch (c) {
            // case 의 값도 int 값이면 무엇이든 된다.
            case 'A': // 0x41 = 65
            case 'C':
            default:
        }
        // String 값을 switch와 case의 값으로 사용 할수 있다.
        String str = "hello";
        switch (str) {
            // case 의 값으로 String 가능하다.
            case "hello":
            case "halo":
            default:
        }

        
    }
}