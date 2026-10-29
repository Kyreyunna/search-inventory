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
//        String command = "";
//        while (!command.equalsIgnoreCase("X")) {
//            System.out.println("A) List all products");
//            System.out.println("D) Lookup a product by its id");
//            System.out.println("X) Quit the application");
//            System.out.print("Enter a command: ");
//            command = scanner.nextLine();

//             TODO: switch on command.toUpperCase(): "H" says hello, "C" counts to 3,
//                   "X" says goodbye, and default says the command is invalid
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 2: ");
        int productNumber = scanner.nextInt();
        String description = switch (productNumber) {
            case 0 -> "456710' 2x4  (grade B)9.99\n";
            case 1 -> "1234Hammer19.49\n";
            case 2 -> "2345Box of nails9.29\n";
            default -> "Invalid product";
        };
//        int dayNumber = 3;
//        String description;
//        if (dayNumber == 0) {
//            description = "Sunday";
//        } else if (dayNumber == 1) {
//            description = "Monday";
//        } else if (dayNumber == 2) {
//            description = "Tuesday";
//        } else if (dayNumber == 3) {
//            description = "Wednesday";
//        }
//        scanner.close();
    }
}
