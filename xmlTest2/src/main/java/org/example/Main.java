package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("Class.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);


        NodeList students = doc.getElementsByTagName("student");

        System.out.println(students.getLength());

        for (int i = 0; i < students.getLength(); i++) {
            List<Student> list = new ArrayList<>();
            Node student = students.item(i);
            Element studentElement = (Element) student;
            String idString = studentElement.getElementsByTagName("id").item(0).getTextContent();
            int id = Integer.parseInt(idString);
//            String firstName = studentElement.getElementsByTagName("firstname").item(0).getTextContent();
//            String lastName= studentElement.getElementsByTagName("lastname").item(0).getTextContent();
//            String subject = studentElement.getElementsByTagName("subject").item(0).getTextContent();
//            String markId = studentElement.getElementsByTagName("marks").item(0).getTextContent();
//            int mark = Integer.parseInt(markId);

            Student student1 = new Student();
            student1.setId(id);
            list.add(student1);
            for (Student std : list){
                System.out.println(std.getId());
            }
        }

    }
}