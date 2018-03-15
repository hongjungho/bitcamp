// 메서드 : 리팩토리 
package step06;

import java.util.Scanner;

public class Exam01_3 {

    // 스페이스를 출력하는 코드들을
    // 관리하기 쉽도록 별도의 블록에 모아 놓는다.
    // 그리고 그 블록에 대해 이름을 붙인다
    // => 이렇게 정의한 블록을 "메서드" 또는
    //    "함수"이라 부른다.
    // => 자바는 "메서드" 이름을 주로 사용한다.
    public static void printSpaces(int len){
        for (int i = 0; i < len; i++){
            System.out.print(" ");
        }
    }
    public static void printStarts(int len) {
        for (int i = 0; i < len; i++){
                System.out.print("*");
        }
    } 

    // 코드를 유지보수 하기 쉽도록 가능한 기능 별로 묶어 둔다.
    // 그래서 Exam01_2에 있던 코드 중에서 공백을 계산하는 코드를
    // 별도의 블록으로 분리하여 이름을 부여한다.
    public int getSpaceLength(int totalStar,int displayStar) {
        return (totalStar - displayStar) / 2;
    }   
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();
        
        for(int starLen = 1; starLen <=len; starLen +=2) {
        // 출력할 스페이스의 개수를 계산하는 코드를
        // 블록에 묶어 놓고 이름을 부여해두면
        // 코드를 이해하기가 쉽다.
            printSpaces (getSpaceLength(len, starLen));
            printStarts (starLen);
            System.out.println();
            
        }
    }
}