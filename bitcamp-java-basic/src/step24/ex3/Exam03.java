// 스레드 만들기 I - Thread를 상속 받기
package step24.ex3;

public class Exam03 {

    public static void main(String[] args) {
        new Thread() {
        @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }.start();
        
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>> " + i);
        }

    }

}
