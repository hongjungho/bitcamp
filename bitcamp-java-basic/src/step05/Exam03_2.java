// 흐름 제어문 - break 와 continue

package step05;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

// 상수를 좀 더 조직적으로 관리하는 방법
// => enum을 사용하여 상수를 정의한다.
enum Level {
    GUEST2,MEMBER2,ADMIN2
}
public class Exam03_2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
    //1부터 100까지의 합은?
      while (count < 100) {
        count++;
        sum += count;
        
    }
    System.out.printf("sum=%d, count=%d\n",sum,count);
    System.out.println("-------------");
    //continue 사용 전
    //1부터 100 까지의 카운트를하는데 단합은 50까지만 계산한다
    sum=0; 
    count=0;
    while (count < 100) {
        count++;
        if (count > 50)
            break;
        sum += count;
       
    }
    System.out.printf("sum=%d, count=%d",sum,count); 



    sum=0; 
    count=0;
    while (count < 100) {
        count++;
        if (count > 50)
            break;
        sum += count;
       
    }
    System.out.printf("sum=%d, count=%d",sum,count); 





    }
}
