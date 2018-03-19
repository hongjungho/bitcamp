// 메서드분류 - 인스턴스 메서드 사용
package step07;

public class Calculator4 {
    int result = 0;
    
    // 인스턴스의 변수를 다룰때는 인스턴스 메소드를 사용하는것이 편하다
    // 왜 ?
    // => 파라미터로 따로 인스턴스의 주소를 받을 필요가 없기 때문이다.
    public void plus(int value) {
        // 인스턴스 메서드는 인스턴스의 주소를 this 라는 내장 변수에 자동으로 받는다.
        this.result += value;
    }
    public void minus(int value) {
        //result ㅂ는 더이상 클래스 변수가 아니기 때문에 직접 접근할수없다.
        // 오직 인스ㅓㅌㄴ스 주소를 통해서만 접근할수있다
        this.result -= value;
    }
    public void multiple(int value) {
        //result ㅂ는 더이상 클래스 변수가 아니기 때문에 직접 접근할수없다.
        // 오직 인스ㅓㅌㄴ스 주소를 통해서만 접근할수있다
        this.result *= value;
    }
    public void divide(int value) {
        //result ㅂ는 더이상 클래스 변수가 아니기 때문에 직접 접근할수없다.
        // 오직 인스ㅓㅌㄴ스 주소를 통해서만 접근할수있다
        this.result /= value;
    }
    

        
    


}
