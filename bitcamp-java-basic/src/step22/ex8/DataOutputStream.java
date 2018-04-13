package step22.ex8;

import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStream extends OutputStream  {
    OutputStream out;
    
    
    public DataOutputStream(OutputStream out) throws Exception {  // 생성자를 통하여  dataoutputStream을 만들때 outputStream 값을 대입시킨다?
        this.out=out;
    }
    
    @Override
    public void write(int b) throws IOException { // 쓰는이유 :dataoutputStream 이 상속받은 outputStream 클래스에서
                                                  //write(int x)는 추상메서드로 정의했기때문에 하위클래스인 dataoutputStream에서 따로 정의해하한다.
        out.write(b);
        
    }
    public void writeUTF(String str) throws Exception {
        // 상속 받은 write() 메서드를 사용하여 문자열 출력
        byte[] bytes = str.getBytes("UTF-8"); 
        out.write(bytes.length);
        out.write(bytes);
        
    }
    
    public void writeInt(int value) throws Exception {
        // 상속 받은 write() 메서드를 사용하여 int 값 출력
        out.write(value >> 24);
        out.write(value >> 16);
        out.write(value >> 8);
        out.write(value);
    }
    
    public void writeLong(long value) throws Exception {
        // 상속 받은 write() 메서드를 사용하여 long 값 출력
        out.write((int)(value >> 56));
        out.write((int)(value >> 48));
        out.write((int)(value >> 40));
        out.write((int)(value >> 32));
        out.write((int)(value >> 24));
        out.write((int)(value >> 16));
        out.write((int)(value >> 8));
        out.write((int)value);
    }
    
    public void writeBoolean(boolean value) throws Exception {
        // 상속 받은 write() 메서드를 사용하여 boolean 값 출력
        if (value) 
            out.write(1);
        else 
            out.write(0);
    }
    public void close()throws IOException {
        out.close();
    }
}





