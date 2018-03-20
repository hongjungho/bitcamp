// 초기화 블록 - 인스턴스 블록
package step08;

public class Exam06_1 {
    static class A {
        int a;
        int b;
 
        { //아무 이름 없이 선언하는 블록이 "초기화블록" 이다.
            // 인스턴스를 생성한 후, 생성자를 호출하기전에 자동으로 실행한다.
            System.out.println("{1}");
           
        }
        A() {
            System.out.println("A()");
        }
        
        { // 초기화 블록은 여러개 정의할수 있다.
          // 순서대로 호출한다.
            System.out.println("{2}");
            // 이렇게 초기화 블록을 나눠서 여러 개 정의하면 코드를 유지보수하기 어렵다
            // 할수는 있지만 이렇게 하지말라!
            //만약 초기화 블록을 정의한다면 한개만 하라!
        }
        
    }
    public static void main(String[] args) {
        A obj1 = new A();
    }
}
