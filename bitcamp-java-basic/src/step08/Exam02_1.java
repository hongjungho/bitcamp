// 인스턴스 변수
package step08;

public class Exam02_1 {
    
    static class A {
        //1) 클래스 메소드
        // => static이 붙은 메소드
        // => 클래스 이름으로 호출할수있다.
        // => "스태틱 메서드"라고도 부른다.
        static void m1() {
            System.out.println("m1()");
        }
        
        //2) 인스턴스 메서드
        // => static이 붙지 않은 메서드
        // => 인스턴스 주소가 있어야만 호출할 수 있다.
        void m2() {
            System.out.println("m2()");
        }
    }

    public static void main(String[] args) {
        // 클래스 메서드 호출
        // 문법) 클래스명. 메서드명();
        A.m1();
        
        // => 인스턴스 메서드는 클래스 이름으로 호출할수 없다~~~~~~
        //A.m2(); // 컴파일 오류!
        
        A obj1 = new A();
        obj1.m1(); // OK! 그런데 이렇게 하지 말라! (클래스 메소드는 클래스이름으로 선언해라 안헷갈리게)
        
        obj1.m2(); // 
    }

}
// 인스턴스 변수는 new 명령을 실행할 때 마다 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 때 사용한다
