// 생성자 - 파라미터를 받는 생성자

package step08;

public class Exam04_2 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        //생성자가 한개라도 있으면 컴파일러는 기본 생성자를 만들어 주지 않는다.
        // => 이렇게 생성자는 새로 만든 인스턴스 변수를초기화 시키는 일을한다
        Score(String name, int kor, int eng , int math) {
            System.out.println("Score(String,int,int,int)호출!");
            //파라미터로 받은 값을 새로 만든 인스턴스 변수에 저장
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math= math;
            this.compute();
        }

        public void compute() {
            // 내장 변수 this 에는 compute()을 호출할때 넘겨준 인스턴스 주소가 들어 있다.
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum/3f;
        }
    }

    public static void main(String[] args) {
        // Score 클래스에는 기본 생성자가 없기 때문에
        // 다음 문장은 컴파일 오류!
        // Score s0 = new Score(); 컴파일 오류
        
        // Score 인스턴스를 만든 후에는 
        // 생성자를 호출할때 그생성자의 파라미터값을 주어야한다.
        Score s1= new Score("홍길동",1,2,3);
        Score s2= new Score("유관순",1,2,3);
        System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.average);
        System.out.printf("%s,%d,%d,%d,%d,%.1f",s2.name,s2.kor,s2.eng,s2.math,s2.sum,s2.average);
        
    }

}