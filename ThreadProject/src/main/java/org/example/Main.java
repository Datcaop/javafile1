package org.example;

import lombok.SneakyThrows;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {


        AppendThread appendThread1 = new AppendThread("test.txt","this is from thread 1 ");
        AppendThread appendThread2 = new AppendThread("test.txt","this is from thread 2");

        appendThread1.start();
        appendThread2.start();
    }
}