// 메서드 : 스택 메모리 응용
package step06;

import java.util.Scanner;

public class Exam04_6 {

    static int sum(int value) {

        // 종료 조건을 빼버리면 무한으로 호출한다.
        /*if (value == 1)
            return 1; */
            long a1, a2,a3,a4,a5,a6,a7,a8,a9,a10;
            long a11, a21,a31,a41,a51,a61,a71,a18,a19,a110;
            System.out.println(value);
        return value + sum(value - 1);

    }




    public static void main(String[] args) {

        System.out.println(sum(5));
        }
}