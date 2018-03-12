// 형변환 - 명시적 형변환 II
package step02;

public class Exam08_6 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;

        //1) 큰 메모리의값 을 작은 메모리에 저장하는 경우
        // => 작은 메모리에 들어갈 수 있는 값인 경우에 형변환을 해야 한다.
        
        byte b2 = (byte)s; //명시적 형변환
        System.out.println(b2);
        
        b2 = (byte)i; //명시적 형변환
        System.out.println(b2);

        b2 = (byte)l; //명시적 형변환
        System.out.println(b2);

        // 리터럴의 값이 작은메모리에 들어갈수있는 값이라면
        // 큰메모리에 저장된 값이라도 형변환하여 작은메모리에 넣을수있다.
        int i2 = 300;
        b2 = (byte) i2;
        System.out.println(b2);
    }
}
// 명시적 형변환
// - 큰 메모리의 값을 작은 메모리로 변환 할 때
// - 부동소수점을 정수로 변환 할 때
// - 문법
//'''변수 = (바꾸조하는타입)변수 또는 값;
