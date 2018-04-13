// DataOutputStream을 이용하여 객체 출력 - 인스턴스의 값을 출력
package step22.ex8;

import java.io.FileOutputStream;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test7.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        DataOutputStream out = new DataOutputStream(bufOut);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        long startTime = System.currentTimeMillis();
        
        for(int i = 0; i < 10000; i++) {
            out.writeUTF(member.name); 
            
            out.writeInt(member.age);
            
            out.writeBoolean(member.gender);
        }
        
        long endTime = System.currentTimeMillis();
        out.close();
        
        System.out.println("데이터 출력 완료!");
        System.out.println(endTime - startTime);

    }

}
