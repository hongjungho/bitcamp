// 비교 연산자 - 
package step04;

public class Exam03_4 {
    public static void main(String[] args) {
       boolean a = true;
       boolean b = true;
       boolean r = a || (b = false);
       System.out.printf("a=%b, b=%b, r=%b\n",a,b,r);

        a = true;
        b = true;
        r = a | (b = false);
        System.out.printf("a=%b, b=%b, r=%b\n",a,b,r);
       
    }
}
