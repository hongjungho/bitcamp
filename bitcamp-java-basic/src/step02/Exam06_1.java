// char - 값 할당
package step02;

public class Exam06_1 {
    public static void main(String[] args) {
        // 0 ~ 65535 까지의 코드값을 저장하는 2바이트 메모리
        char c;

        // 비록 정수 리터럴의 크기가 4바이트일지라도
        // 그 리터럴값이 메모리에 저장할수 있다면 허락.
        c = 0;
        c = 65535;
        // 2바이트 크기를 초과하면 불가능
        c = -1;
        c = 65536;
    }
}
