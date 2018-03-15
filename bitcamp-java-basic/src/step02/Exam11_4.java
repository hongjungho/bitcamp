// 변수의 범위 - 변수와 블록
package step02;

public class Exam11_4 {
        
    public static void main(String[] args) {
        int a = 100;
        {
            //int a = 200; // 컴파일 오류!
                         // 메서드 안에서는 변수 이름 중복 불가!
            // 안쪽 블록에서는 바깥 블록의 변수를 사용할수 있다
            a = 200;
            int b = 300;

            //이 블록의 실행이 끝내는 순간
            // 이블록에서 선언된 모든 변수는 제거된다
            //그래서 b는 제거 된다.
        }        
        System.out.println(a);

        // 바깥 블록에서는 안쪽 블록에서 선언된 변수를 사용할수없다
        // 왜?
        // 안쪽 블록의 실행이 끝나면 안쪽 블록에서 선언된 모든 변수ㅠ들이
        // 자동 제거된다.
        //System.out.println(b); //컴파일오류!!
        {
            // 이전 블록에서 선언된 변수는 다음과 같이
            // 다른 블록에서 같은 이름으로 변수를 선언할수 있다
            // 이미 그전의 블록은 실행이 끝났기 때문에
            int b = 400;
        }
    }
}