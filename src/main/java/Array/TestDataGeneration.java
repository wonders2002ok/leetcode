package Array;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class TestDataGeneration {
    public static void main(String[] args) throws IOException {
        final String fileName = "/Users/wanghaiming/lib/age.txt";
        final Random random = new Random();
        BufferedWriter objWriter = null;
        objWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        for (int i = 0; i < 1400000000; i++) {
            int age = Math.abs(random.nextInt()) % 180;
            objWriter.write(age + "\r\n");
        }
        objWriter.flush();
        objWriter.close();
    }
}
