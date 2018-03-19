//사용자 정의 데이터 타입 - 메서드의 활용
package step07;


public class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    //메서드를 이용하여 이 타입의 데이터를 다룰수 있는 연산자를 정의한다.
    // => 사용자 정의 데이터 타입 입장에서는 메서드가 연산자로 불린다
    // => 즉 사용자 정의 데이터 타입에 메서드를 정의하는것은
    //    그 데이터를 다룰 연산자를 정의하는 것이다.
    
    //Score 데이터 값을 다룰수있는 새연산자를 정의
    // = 다음 메서드는 Score 객체의 국영수 값의 합계와 평균을 계산하는 연산자
    public static void calculate(Score2 score) {
        score.sum= score.kor + score.eng + score.math;
        score.average = score.sum/3f;
    }
}

