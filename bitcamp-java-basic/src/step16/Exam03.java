package step16;

import java.io.File;

public class Exam03 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        File currentDir = new File(".");
        System.out.printf("폴더명 : %s\n",currentDir.getName());
        System.out.printf("폴더명 : %s\n",currentDir.getAbsolutePath());
        System.out.printf("계산된 절대 경로 : %s\n",currentDir.getCanonicalPath());
        System.out.printf("계산된 절대 경로 : %d\n",currentDir.getTotalSpace());
        System.out.println("-------------");
        File parentDir = new File("..");
        System.out.printf("폴더명 : %s\n",parentDir.getName());
        System.out.printf("폴더명 : %s\n",parentDir.getAbsolutePath());
        System.out.printf("계산된 절대 경로 : %s\n",parentDir.getCanonicalPath());
        System.out.printf("계산된 절대 경로 : %d\n",parentDir.getTotalSpace());
    }

}
