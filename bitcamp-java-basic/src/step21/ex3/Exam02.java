package step21.ex3;

public class Exam02 {
    
    static void m() throws Throwable {
        throw new Throwable();
    }
    static void m2() throws Error {
        throw new Error();
    }
    static void m4() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args) {
        try {
            m();
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("시스템 끝");
    }
}
