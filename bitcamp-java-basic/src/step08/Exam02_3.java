// 인스턴스 메소드 응용
package step08;

import java.util.Scanner;

public class Exam02_3 {

    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        // 다음 메서드와 같이 인스턴스 변수를 사용하는 경우
        // 인스턴스 메서드로 정의한다.
        
        public void compute() {
            // 내장 변수 this 에는 compute()을 호출할때 넘겨준 인스턴스 주소가 들어 있다.
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum/3f;
        }

    }


    public static void main(String[] args) {
       
        Scanner keyScan = new Scanner(System.in);
        System.out.print("성적 데이터 입력 >");
        Score s1 = new Score();
        s1.name = keyScan.next();
        s1.kor = keyScan.nextInt();
        s1.eng = keyScan.nextInt();
        s1.math = keyScan.nextInt();
        
        System.out.print("성적 데이터 입력 >");
        Score s2 = new Score();
        s2.name = keyScan.next();
        s2.kor = keyScan.nextInt();
        s2.eng = keyScan.nextInt();
        s2.math = keyScan.nextInt();
        
        // 특정 인스턴스에 대해 작업을 수행할 때는 인스턴스 메서드를 호출한다.
        s1.compute();
        s2.compute();
        
        System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.average);
        System.out.printf("%s,%d,%d,%d,%d,%.1f",s2.name,s2.kor,s2.eng,s2.math,s2.sum,s2.average);
        
    }

}
