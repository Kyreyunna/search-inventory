package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App {
    public static void main(String[] args) {


        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("inventory.csv");
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read one line and print it
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
    }
}
