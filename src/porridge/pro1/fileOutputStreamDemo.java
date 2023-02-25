package porridge.pro1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\JavaLearningDemo\\src\\porridge\\pro1\\demo21.txt");
        fos.write("周涵周涵周涵".getBytes());
        fos.close();

    }
}
