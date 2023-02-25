package porridge.pro1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int b;
        FileInputStream fis1 = new FileInputStream("D:\\workspace\\JavaLearningDemo\\src\\porridge\\pro1\\demo2.txt");
// 循环读取
        while ((b = fis1.read())!=-1) {
            System.out.print((char)b);
        }
// 关闭资源
        fis1.close();

    }
}
