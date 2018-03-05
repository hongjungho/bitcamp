// 정수의 리터럴 -크기

package step01;

public class Exam05_3 {
    public static void main(String[] args) {
     // 정수를 표기할 때
     // 크기에 따라 표기방법이 다른대
     // 그냥 작성하면 4바이트 크기의 정수를 의미한다.
    
     System.out.println(2147483647);//4바이트 양의 정수 최대값
     System.out.println(-2147483648);//4바이트 음의 정수 최소값

     // 4바이트를 초과하면 컴파일 오류이다.
     
    System.out.println(100);
    System.out.println(100L);

    }
}
// 10진수
// - 일반적으로 값을 알려주고 싶을때 사용
// 8진수
// 코드에서 거의 사용하지않음
//2진수
// 메모리 상태를 알려주고 싶을때 사용
// 16진수
// 2진수로 표기하면 너무 길어지기때문에 주로 16진수를사용
