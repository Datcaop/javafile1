package Done.JV02_Session03;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv2 {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("C:\\Users\\HP\\Downloads\\test\\Book1.csv");

        // Header name of file csv
//        String[] HEADERS = {"Number", "Name", "Age"};
        String[] HEADERS = {"Age", "Name", "Number"};

        // Create format to parse CSV to "records" (CSVRecord)
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(HEADERS)
                .setSkipHeaderRecord(true)
                .build();
        Iterable<CSVRecord> records = csvFormat.parse(in);

        List<Person> people = new ArrayList<>();

        // go through "records" list to take information through "HEADERS" name
        for (CSVRecord record : records){
            people.add(new Person(Integer.parseInt(record.get("Number")), record.get("Name"), Integer.parseInt(record.get("Age")),
                    "Not defined"));
        }
        System.out.println("people = " + people);
    }
}
