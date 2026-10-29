package com.pluralsight;

import java.util.*;
import java.io.*;


public class App {
    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
//
//
//        try {
//            // create a FileReader connected to the file
//            FileReader fileReader = new FileReader("inventory.csv");
//            // create a BufferedReader to manage the input stream
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            // read one line and print it
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//
//                String[] listOfLine = line.split("\\|");//[id, name, price]
//                Product product = new Product(Integer.parseInt(listOfLine[0]), listOfLine[1], Double.parseDouble(listOfLine[2]));
//                products.add(product);
//                System.out.println(products.get(products.size() - 1).toRow());
////                System.out.println(listOfLine[0] + ", " + listOfLine[1] + ", " + listOfLine[2]);
//
//
//            }
//
//
//            // close the reader to release the file
//            bufferedReader.close();
//        } catch (IOException e) {
//            // print the details so the error is never hidden from you
//            e.printStackTrace();
//        }
//
//
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equalsIgnoreCase("X")) {
            System.out.println("A) List all products");
            System.out.println("D) Lookup a product by its id");
            System.out.println("X) Quit the application");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

//             TODO: switch on command.toUpperCase(): "H" says hello, "C" counts to 3,
//                   "X" says goodbye, and default says the command is invalid


//            System.out.print("Enter a letter: ");
//            String productChoice = scanner.next();
//            String description = switch (productChoice) {
            switch (command.toUpperCase()) {
                case "A" -> {
                    System.out.println("--Full Inventory--");
                }
                case "D" -> {
                    System.out.println("Product id is: ");
                }
                case "X" -> {
                    System.out.println("Application ending. Goodbye!");
                }

                default -> {
                    System.out.println("Invalid product");


                    int dayNumber = 3;
                    String description;
                    if (dayNumber == 0) {
                        description = "Sunday";
                    } else if (dayNumber == 1) {
                        description = "Monday";
                    } else if (dayNumber == 2) {
                        description = "Tuesday";
                    } else if (dayNumber == 3) {
                        description = "Wednesday";
                    }
                }
            }
            scanner.close();
        }
    }
}
