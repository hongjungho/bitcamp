//사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;


public class Score3 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    // 다음 연산자는 계산을 수행할 때마다 인스턴스의 주소를 파라미터로 받아야 한다.
    // 인스턴스 메서드! 
    /*public void Calculate(Score3 ㄴ첵ㄷ) {
        score.sum= score.kor + score.eng + score.math;
        score.average = score.sum/3f;
    }*/
    
    //인스턴스 메서드 
    // => 인스턴스의 주소를 파라미터로 받는것이 아니라,
    //    메서드를 호출할 때 , 메서드 앞에 인스턴스의 주소를 적는다.
    // => 이 인스턴스의 주소는 내장된 this 라는 변수에 복사된다..
    //    그래서 파라미터 대신 ㄷthis 를 사용하면 된다.
    public void calculate() {
        this.sum = this.kor + this.eng + this.math;
        this.average = this.sum /3f;
    }
}

