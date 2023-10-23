package Done.JV02_Session03;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("pom.xml");
        File file1 = new File("D:\\Workspace\\Java\\Java_FPT\\Slide_Java2\\input.txt");
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file1.getAbsolutePath() = " + file1.getAbsolutePath());

        File folder = new File("test");
        List<String> fileNames = Arrays.asList(file.list());
        System.out.println("fileNames = " + fileNames);
        System.out.println("folder.listFiles() = " + folder.listFiles());
        System.out.println("folder.getAbsolutePath() = " + folder.getAbsolutePath());
        if(folder.renameTo(new File("test02"))){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }

    }
}
