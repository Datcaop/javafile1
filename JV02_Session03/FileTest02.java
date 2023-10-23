package Done.JV02_Session03;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileTest02 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\HP\\Downloads\\test");
        List<String> fileNames = Arrays.asList(folder.list());
        System.out.println("fileNames = " + fileNames);

        String path = folder.getAbsoluteFile() + "\\" + "dest";
//        File newFolder = new File(path);
//        if(newFolder.mkdir()){
//            System.out.println("Folder created successfully !");
//        }else {
//            System.out.println("Create fail !");
//        }

        File test1 = new File(folder.getAbsoluteFile() + "\\" + "test1.txt");
        System.out.println("test1.getAbsolutePath() = " + test1.getAbsolutePath());
        if(test1.renameTo(new File("C:\\Users\\HP\\Downloads\\test\\dest" + "\\test1.txt"))){
            System.out.println("Move successfully");
        }else {
            System.out.println("Fail !");
        }

        File file5 = new File("C:\\Users\\HP\\Downloads\\test\\test1 - Copy (2).txt");
        if(file5.delete()){
            System.out.println("Delete file5 successful");
        }else {
            System.out.println("Delete file5 fail");
        }

        List<String> fileName = Arrays.asList(folder.list());
        for(File file: folder.listFiles()){
            System.out.println("file.getName() + \" \" + file.lastModified() +  = " + file.getName() + " " + file.lastModified() +
                    " " + file.length());
        }

    }
}
