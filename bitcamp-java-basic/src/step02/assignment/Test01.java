package step02.assignment;

public class Test01 {
    public static void main(String[]arg) {

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        System.out.print("이름 : "); 
        String name = keyScan.next();

        System.out.print("국어점수 : "); 
        int kor = keyScan.nextInt();

        System.out.print("영어점수 : "); 
        int eng = keyScan.nextInt();

        System.out.print("수학점수 : "); 
        int math = keyScan.nextInt();

        int sum = kor+eng+math;
        double avg = sum/3.0;
        System.out.println("------------------");
        System.out.println(name+" "+kor+" "+eng+" "+math+" "+sum+" "+avg);
    }
    
}
