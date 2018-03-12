// 비교 연산자 - 부동소수점 비교
package step04;

public class Exam02_2 {
    public static void main(String[] args) {
        double d1= 987.6543;
        double d2= 1.111111; 
        
        System.out.println((d1+d2) == 988.765411);
        // 결과는 false 이다.
        // 이유?
        // - 부동소수점 ㄱ밧을 연살 할때 IEEE 754 명세에따라
        // .. 작업을 수행한다. 그과정에 값의 왜곡이 발생할 수 있다.
        // - cpu나 OS, JVM의 문제가 아니다.
        // - IEEE 754 명세에 따라 부동소수점을 처리하는 모든
        //... 컴퓨터에서 발새앟는문제이다.
        double x = 234.765411;
        double y = 754.0;
        double EPSILON = 0.00001;
        System.out.println(Math.abs((d1+d2) - 988.765411 ) < EPSILON);
    }
}
