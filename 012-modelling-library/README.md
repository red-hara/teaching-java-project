# Modelling library

In this example Library Accounting System (LAS) data structure is proposed.
Each book model in LAS has following fields:
- title
- author (if there are multiple authors, they are separated by commas)
- page count
- approximate cover color in custom HSV notation
- publishing year

The `Book` class is designed in accordance with this model.
This class is supplemented with the `printData` method for partial book data printing.

## Running this example

```
mvn package
java -cp target/modelling-library-0.0.1.jar Library
```

In this example single entry (`lor`) is created and its data is displayed.
