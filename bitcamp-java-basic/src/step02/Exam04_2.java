// 정수 변수 - 크기가 다른 변수끼리 값 할당

package step02;

public class Exam04_2 {
    public static void main(String[]arg) {
        int i = 100;
        byte b = 100;
        
        // i 변수에 들어있는 값이 byte메모리에 저장할수 있을지라도
        // 리터럴이 아닐경우에는 큰 크기의 메모리값을
        // 작은 크기의 메모리에 저장할수 없다.
        b = i; //컴파일 오류!
        short s = 100;
        s = i; // 컴파일 오류!

        int j = 100;
        j = i; // 컴파일 가능

        long l = 100;
        l = i; // 컴파일 가능
    }
}
