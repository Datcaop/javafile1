package org.example;

import java.time.LocalDate;

public class Newpaper extends Document {
    private LocalDate releaseDate;

    public Newpaper(String documentId, String publishername, Integer number, LocalDate releaseDate) {
        super(documentId, publishername, number);
        this.releaseDate = releaseDate;
    }
}
