package Test3;

import ReadPom.Project;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class main3 {
    public static void main(String[] args) throws IOException {
        File file = new File("Product.xml");
        XmlMapper mapper = new XmlMapper();
        Product product= mapper.readValue(file, Product.class);
        String pom = mapper.writeValueAsString(product);
        System.out.println(pom);
    }



}
