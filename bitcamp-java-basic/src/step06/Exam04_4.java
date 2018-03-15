// 메서드 : 인스턴스와 Heap 메모리 영역
package step06;

import java.util.Scanner;

public class Exam04_4 {

    static void m1 (int value) {
        int r1 = m2(value);
        int r2 = m3(value);
        return r1 + r2;
    }

    static void m2 (int value) {
        return value + 100;
    }

    static void m3 (int value) {
        return value + 200;
    }


    public static void main(String[] args) {
        int r = m1(5);
        System.out.println(r);
        }
}

