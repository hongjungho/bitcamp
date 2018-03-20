// 특별한 인스턴스 메서드 - 생성자 (constructor)

package step08;

public class Exam04_1 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;

        // 생성자
        // => 클래스 이름과 같은 이름으로 메서드를 만든다.
        // => 리턴 타입을 선언하지 않는다. 즉 값을 리턴하지 않는다.
        // => 인스턴스를 만들 때 자동 호출된다.
        // => 일반 메서드처럼 나중에 따로 호출할수 없다.
        // => 만약 개발자가 생성자를 만들지 않으면 컴파일러가 기본 생성자를 자동으로 생성해준다.
        // => 보통 인스턴스를 만든 후에 인스턴스 변수를 초기화시키는 용도로 정의한다.
        // => 다음과 파라미터가 없는 생성자가 기본 생성자 이다.
        Score() {
            System.out.println("Score()");
        }

        public void compute() {
            // 내장 변수 this 에는 compute()을 호출할때 넘겨준 인스턴스 주소가 들어 있다.
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum/3f;
        }
    }

    public static void main(String[] args) {
        // 생성자를 호출하는 방법
        // => 인스턴스를 생성하는 new 명령에서 호출할 생성자의 파라미터 값을 지정하면 된다.
        // = > 다음과 같이 파라미터 값을 주지 않으면 기본 생성자를 호출하라는 뜻이다.
        Score s1 = new Score(); 
        
        // 생성자를 호출 하지 않을수 있는가?
        // => 컴파일 오류다.
        //Score s2 = new Score;
        
        Score s3 = new Score();
        
    }

}