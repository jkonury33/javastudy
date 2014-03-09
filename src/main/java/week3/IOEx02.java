package week3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class IOEx02 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("org.bin");
        OutputStream out = new FileOutputStream("cpy.bin");
        
        int copyByte = 0;
        int byteData;
        byte[] buf = new byte[1024];
        
        while(true) {
            byteData = in.read(buf);
            if(byteData == -1) {
                break;
            }
            
            out.write(buf, 0, byteData);
            copyByte += byteData;
        }
        
        in.close();
        out.close();
        System.out.println("복사된 바이트 크기 " + copyByte);
    }
}
