package Week11.FileIO;

import java.io.File;
import java.time.Instant;

public class FileClassUtilities {
    public static void main(String[] args) {
        File file = new File("Week11/FileIO/files/hello.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
        File file2 = new File(file.getParent());
        System.out.println(file2.isDirectory());
        System.out.println(Instant.ofEpochMilli((file.lastModified())));
        System.out.println(file.length() + " Bytes");
    }
}
