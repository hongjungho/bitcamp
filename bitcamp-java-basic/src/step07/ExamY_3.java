// 인
package step07;





public class ExamY_3 {
    public static void main(String[] args) {
        // 클래스 변수는 옺기 한개만 존재하기 때문에
        // 여러 개의 작업을 분리하여 진행할 수 없다.
        
        // 다음 두 개의 식을 분리하여 계산해보자!
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        
        // 식1과 식2를 개별적으로 동시에 계산할수 없다.
        
        Calculator2.plus(2);
        Calculator2.plus(3);
        
        Calculator2.plus(3);
        Calculator2.multiple(2);
        
        Calculator2.minus(1);
        Calculator2.plus(7);
        
        Calculator2.multiple(7);
        Calculator2.divide(4);
        
        Calculator2.divide(3);
        Calculator2.minus(5);

        // Calculator2의 result 변수는 한개이기 때문에
        // 결과를 출력하면 식1과 식2가 모두 계산된 결과가 출력될것이다.
        
        System.out.printf("result = %d\n",Calculator2.result);
    }
}

