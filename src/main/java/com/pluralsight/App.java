package com.pluralsight;

import java.util.*;
import java.io.*;


public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        try {
            // create a FileReader connected to the file
            FileReader fileReader = new FileReader("inventory.csv");
            // create a BufferedReader to manage the input stream
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read one line and print it
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] listOfLine = line.split("\\|");//[id, name, price]
                Product product = new Product(Integer.parseInt(listOfLine[0]), listOfLine[1], Double.parseDouble(listOfLine[2]));
                products.add(product);
                System.out.println(products.get(products.size() - 1).toRow());
//                System.out.println(listOfLine[0] + ", " + listOfLine[1] + ", " + listOfLine[2]);


            }


            // close the reader to release the file
            bufferedReader.close();
        } catch (IOException e) {
            // print the details so the error is never hidden from you
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);

        String command = "";
        while (!command.equalsIgnoreCase("X")) {
            System.out.println("H) Say hello");
            System.out.println("C) Count to 3");
            System.out.println("X) Exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            // TODO: switch on command.toUpperCase(): "H" says hello, "C" counts to 3,
            //       "X" says goodbye, and default says the command is invalid
        }
        int dayNumber = 3;
        String description = switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        scanner.close();
    }
}
