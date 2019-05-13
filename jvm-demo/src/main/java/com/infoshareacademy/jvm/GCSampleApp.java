package com.infoshareacademy.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GCSampleApp {

    public static void main(String[] args) throws IOException {
        Thread.currentThread().setName("GCSampleThread");

        System.out.println("Press enter to start ...");
        System.in.read();
        System.out.println("Starting ...");

        List<Object> list = new ArrayList<>();

        // Keep adding new elements to the 'list'
        // Clear the list every 10 000 iterations
        // Monitor the memory in jvisualvm
    }
}
