package ReadPom;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.TClass;

import java.io.File;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws IOException {
        File file = new File("pom.xml");
        XmlMapper mapper = new XmlMapper();
        Project project = mapper.readValue(file, Project.class);
        String pom = mapper.writeValueAsString(project);
        System.out.println(project);
    }
}
