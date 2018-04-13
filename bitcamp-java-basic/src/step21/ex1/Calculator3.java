package step21.ex1;

public class Calculator3 {
    public static int compute(String op, int a, int b) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default:
            throw new RuntimeException("연산자가 유효하지 않습니다");
        }
        
    }
}
