package exercise.exercise_0517.io_0517;

import java.io.*;
import java.util.Scanner;

public class PrintStreamTest {
    public static void main(String[] args) throws IOException {
        //1.文件的写入
        File file = new File("C:\\Users\\lenovo\\Desktop\\"+"TestIO.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("姓名:小明\n".getBytes());
        outputStream.write("年龄:20".getBytes());
        //2.文件的读取
        Scanner scanner = new Scanner(new FileInputStream(file));
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
