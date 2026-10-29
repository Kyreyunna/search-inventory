# Bedtime Stories

A command-line app that reads a children's story from a file
and prints it with **line numbers**.

## Features

- Pick any story by its file name
- Every line is numbered
- A friendly message if the story isn't found

## How to run it

1. Open the project in IntelliJ
2. Run `App.java`
3. Type a story name, like `goldilocks.txt`

## Interesting code

```java
String line = bufferedReader.readLine();
while (line != null) {
    System.out.println(line);
    line = bufferedReader.readLine();
}
```

## Screenshot

![The home screen](images/home-screen.png)

Made by Sam for the [Java Academy](https://craigmckeachie.github.io/java-academy-docs/).





























