package Done.JV02_Session03;

import org.apache.commons.lang3.SerializationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\HP\\Downloads\\test\\test1.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(strings);

        Student student = Student.builder()
                .name("dao")
                .school("fpt")
                .build();
        Student student2 = Student.builder()
                .name("dao2")
                .school("fpt")
                .build();
        List<Student> students = List.of(
                student2, student
        );
        // Write file
        byte[] data = SerializationUtils.serialize(student);
        System.out.println("data = " + data);

        Files.write(Paths.get("student.txt"), data);

        //Read file again
        byte[] bytes = Files.readAllBytes(Paths.get("student.txt"));
        Student student1 = SerializationUtils.deserialize(bytes);
        System.out.println("student1 = " + student1);

    }
}
