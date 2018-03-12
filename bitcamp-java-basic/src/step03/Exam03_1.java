// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1 {
    public static void main(String[] args) {
      

        class Score {
            
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        // Score 레퍼런스 선언
        Score s1;
        // 인스턴스를 만들어 그주소를 레퍼런스에 저장한다.
        s1 = new Score();
        // 새 인스턴스를 만들어 s1에 주소를 저장한다.
        s1 = new Score();

        //그러면 기존에 들어 있던 주소는 잃어 버린다.
        // 주소를 잃어버려 사용할 수없는 메모리를
        // "가비지(garbage)라고 부른다"

        // 가비지는 가비지 컬렉터에 의해 메모리에서 해제된다.
        // 가비지 컬렉터(garbage collector)의 실행
        // - 메모리 부족할 때
        // - CPU가 한가 할때
        // - System.gc()를 호출하여 가비지 실행을 요청할때.
        //   물론 이경우는 바로 실행하는 것이아니라 예약하는것이다.
        
    }
}
