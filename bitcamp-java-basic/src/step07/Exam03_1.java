// 사용자 정의 데이터 타입 - 인스턴스 메소드
package step07;


public class Exam03_1 {
    public static void main(String[] args) {

        Score3 score = new Score3();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        // 다음은 Score의 값을 다루기 위해 non-instance 메서드를 호출하는 예이다.
        // => non-instance 메서드 = static 메서드 = 클래스 메서드
        
        // 클래스 메서드를 사용할 때 마다 매번 인스턴스의 주소를 파라미터로 넘겨줘야 했다.
        // 그러나 인스턴스의 메모리를 사용하는 순간 파라미터가 아닌 
        // 메서드 앞에 인스턴스 주소를 준다.
        score.calculate(); // 변수.연산자(); 형태와 같다 ex) i++;
        
        System.out.printf("%s,%d,%d,%d,%d,%.1f\n",
                score.name,score.kor,score.eng,score.math,score.sum,score.average);
    }
}

// 사용자 정의 데이터 타입에서
// 인스턴스의 값을 다루는 연산자를 정의할 때는
// 인스턴스 메서드로 만드는 것이 사용하기 편하다!

