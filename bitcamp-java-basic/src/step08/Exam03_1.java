// 내장변수 this 
package step08;

import step08.Exam01_3.A;

public class Exam03_1 {
    static class A {
        int value;
        
        static void m1() {
            // 클래스 메서드는 인스턴스 주소 없이 호출 되기 때문에
            // 인스턴스 주소를 받는 내장 변수가 없다.
            this.value=100; // 컴파일 오류!
        }
        void m2() {
            // 인스턴스 메서드는 인스턴스 주소가 있어야만 호출 되기 때문에
            // 인스턴스 주소를 받을 변수가 내장 되어있다.
            this.value=100;
        }
        void m3() {
            // 인스턴스 변수를 사용할때 this를 생략할수 있다.
            value = 200; //앞에 자동으로 this가 붙는다.
        }
        void m4(int value) {
            value = 200; // 로컬 변수이다.
            
            this.value = 300; //인스턴스 변수이다.
            // 따라서 인스턴스 변수를 가리키고 싶으면 this를 붙여야한다.
        }
    }
    public static void main(String[] args) {
        // 클래스 메서드는 인스턴스 주소없이 클래스 이름으로 호출한다.
        // 그래서 클래스 메서드는 this 라는 내장 변수가 없는것이다.
        A.m1();
        
        A obj1= new A();
        
        //인스턴스 메서드는 인스턴스 주소가 있어야만 호출할 수 있기 때문에
        //인스턴스 메서드에는 인스턴스 주소를 받을수 있는 내장변수 this가 있다.
        obj1.m2();
        
        //물론 클래스 메서드도 레퍼런스를 가지고 호출할 수 있지만
        // 인스턴스 주소가 메서드에 전달되는것은 아니다.
        obj1.m1();
        
        A obj2 = new A();
        
        // 인스턴스 메서드의 this 변수는 메서드를 호출할 때 전달한 인스턴스 주소 값을 가진다.
        // 그래서 메서드가 호출 될때 마다 this값을 호출한다.
        obj2.m2();
    }

}
