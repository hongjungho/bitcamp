// 키보드 입력 받기.
package step02;

public class Exam02_2 {
    public static void main(String[]arg) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        System.out.println("이름? "); 
        System.out.println(keyScan.nextLine());
        System.out.println("전화? "); 
        System.out.println(keyScan.nextLine());
        System.out.print("이메일? "); 
        System.out.println(keyScan.nextLine());
        System.out.print("나이? "); 
        System.out.println(keyScan.nextLine());
        System.out.print("재직여부?(Y/N) "); 
        System.out.println(keyScan.nextLine());
        
        // 팀 멤버의 정보를 입력 받아 출력하라.
        // 이름 , 전화 , 이메일 , 나이 , 재직여부
        // 이름? 홍길도 전화? 1111-2222 이메일? hong@test.com 나이 ? 20 재직여부? y
    }
}
