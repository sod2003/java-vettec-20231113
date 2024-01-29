package Week11.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
    private static final String path = "./Week11/FileIO/files/";
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(new File(path + "hello.txt"))) {
            BufferedReader br = new BufferedReader(reader);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println("Done reading file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}