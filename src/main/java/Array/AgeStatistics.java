package Array;

import java.io.*;

public class AgeStatistics {
    public static void main(String[] args) throws IOException {
        String str = null;
        String fileName = "/Users/wanghaiming/lib/age.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");

        long start = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int total = 0;
        int data[] = new int[200];
        while ((str = bufferedReader.readLine()) != null) {
            int age = Integer.valueOf(str);
            data[age]++;
            total++;
        }

        System.out.println("Total data size is " + total);

        for (int i = 0; i < 200; i++) {
            System.out.println(i + ":" + data[i]);
        }

        System.out.println("Total time spent is " + (System.currentTimeMillis() - start) + "ms");

    }
}
