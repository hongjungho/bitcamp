// 산술 연산자 : 연산의 결과 타입  
package step04;

public class Exam01_4 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        float r = i/(float)j; // int 와 int의 연산 결과는 항상 int 이다.
                              // 따라서 r 변수에 넣기전에 이미 결과는 정수2가된다.
                              // 정수 2를 float 변수에 넣으면 
                              // 출력할 때 2.0이 된다.
        System.out.println(r);

        //해결책! 
        //- 변수에 들어 있는 값을 다른 타입으로 바꿔라
        //  "형변환(type casting)" 하라!
    
    }
}
