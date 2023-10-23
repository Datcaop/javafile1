package org.example;

public class Magazine extends Document {
    private String issueNumber;
    private String issueMonth;

    public Magazine(String documentId, String publishername, Integer number, String issueNumber, String issueMonth) {
        super(documentId, publishername, number);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }
}
