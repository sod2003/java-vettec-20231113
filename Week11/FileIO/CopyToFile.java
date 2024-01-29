package Week11.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyToFile {
    private static final String path = "./Week11/FileIO/files/";

    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter( new FileWriter(path + "copy.txt"))) {
            BufferedReader br = new BufferedReader(new FileReader(path + "hello.txt"));
                String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            br.close();
            bw.write("Done.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
