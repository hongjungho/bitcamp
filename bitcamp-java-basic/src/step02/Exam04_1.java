// 정수 변수

package step02;

public class Exam04_1 {
    public static void main(String[]arg) {
       byte b;
       b = 127;
       b = -128;

       //b = -129; //컴파일 오류
       System.out.println(b);
       short s;
       s = -32768;
       s = 32767;
       int i;
       i = -2147483648;
       i = 2147483647;

       long l;
       l = -9223372036854775808l;
       l = 9223372036854775807l;

       byte b2;
       // 4바이트 정수 리터럴의 경우에만 byte나 short메모리에 
       // 유효한 값을 저장할수 있게 허락한다.
       // 8바이트 정수 리터럴일 경우에는
       // 비록 byte나 short 메모리에 저장할 수 있는 값이라도
       // 허락하지 않는다. 컴파일 오류다
       b2 =100;
       b2 =100L; //컴파일 오류!
    
        
    }
}
