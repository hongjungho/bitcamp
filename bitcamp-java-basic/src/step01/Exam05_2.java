// 정수의 리터럴 II- 자릿수 표기

package step01;

public class Exam05_2 {
    public static void main(String[] args) {
     // _를 사용하여 숫자의 자릿수를 표시 할수 있다.
     // 물론 자리 위치는 작성자 마음이다.
    
     System.out.println(12783406);
     System.out.println(1278_3406);
     System.out.println(12_78_3406);
     // 2진수
     System.out.println(0B1100100);
     System.out.println(0B1100_100);
     System.out.println(0B1100100);
     // 16진수
     // 0x 또는 0X로 시작한다.
     System.out.println(0x64);
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
