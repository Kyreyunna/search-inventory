# Search Inventory

A scanner with a **menu** that displays different options and runs until the user exits.

## Features

- Scanner prompts the user to enter a letter
- While loop keeps running the application's menu until you choose to exit
- A friendly message when you exit the menu

## How to run it

1. Open the project in IntelliJ
2. Run `App.java`
3. Type one of the options given in the menu presented

## Interesting code

```java
package com.pluralsight;

import java.util.*;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equalsIgnoreCase("X")) {
            System.out.println("A) List all products");
            System.out.println("D) Lookup a product by its id");
            System.out.println("X) Quit the application");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();
        }
    }
}
```

## Screenshot

<img alt="The display menu" src="C:\Users\kyreyunnahaugabook\OneDrive - Year Up- BOS\Pluralsight-Workbook3_Folder\search-inventory\images\display-menu.png"/>





























