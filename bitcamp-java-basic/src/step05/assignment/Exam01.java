package step05.assignment;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int count = 0;
        while (count < len) {
            
            int s = (len - count )/2;
            int h = 0;
            
            while(h<s){
                System.out.print(" ");
                h++;
                
            }
            int starCnt = 0;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count+=2;
        }
    }
}