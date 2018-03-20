// 생성자 - 여러개의 생성자 정의 하기

package step08;

public class Exam04_3 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        Score() {
            System.out.println("Score()");
        }
        Score(String name){
            System.out.println("Score(String)");
            this.name = name;
        }

        public void compute() {
            // 내장 변수 this 에는 compute()을 호출할때 넘겨준 인스턴스 주소가 들어 있다.
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum/3f;
        }
    }

    public static void main(String[] args) {
        // 생성자가 여러 개일때 파라미터에 전달하는 값으로 구분한다.
        Score s1= new Score();
        Score s2= new Score("유관순");
        
        System.out.printf("%s,%d,%d,%d,%d,%.1f\n",s1.name,s1.kor,s1.eng,s1.math,s1.sum,s1.average);
        System.out.printf("%s,%d,%d,%d,%d,%.1f",s2.name,s2.kor,s2.eng,s2.math,s2.sum,s2.average);
        
    }

}