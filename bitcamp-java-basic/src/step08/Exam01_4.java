// 클래스 변수 와 인스턴스 변수 생성 시점과 메모리 영역
package step08;

public class Exam01_4 {
    static class A {
        static int v1; 
        int v2; 
    }
    public static void main(String[] args) {
        A.v1 = 100;
        //A.v2 = 200;// 컴파일오류!
        // 컴파일 v2 는 인스턴스 변수이기 떄문에 사용하기전에 new 명령으로 생성해야 한다.
        A p = new A(); //이제 v2 변수는 Heap에 생성되었다
        
        //v2 인스턴스 변수는 인스턴스 주소를 통해 사용해야 한다.
        // 클래스 이름으로 사용할수없다!
        // A.v2 = 200; // 컴파일 오류!
        p.v2 = 200; // OK!
        
        //인스턴스 변수는 인스턴트를 만들때 마다 생성된다.
        A p2 = new A();
        p2.v2 = 200;
        System.out.printf("A.v1=%d,p.v2=%d,p2.v2=%d",A.v1,p.v2,p2.v2);
        
    }

}
// 클래스 변수는 클래스가 로딩될 때 딱 한번 자동으로 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
// 왜? 변수가 한 개 이다.