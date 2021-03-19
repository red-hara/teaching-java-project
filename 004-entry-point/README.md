# Entry point

Execution of any program should start somewhere.
Java programs start with the `main` function.
For now let's say that `function` is just named set of commands.
There may be numerous `main` functions scattered among `.java`/`.class` files.

First, compile this demo project:

```
mvn package
```

Then run Java Virtual Machine with first entry point:

```
java -cp target/entry-point-0.0.1.jar Door
```

Try another entry point:

```
java -cp target/entry-point-0.0.1.jar Window
```

Not every `main` function will work.
It must obey specific rules:
1. The `main` function must be `public static void`;
2. The `main` function must receive `String[] args` (one can actually change `args` to any other proper name).

If you try to launch Java Virtual Machine with `.class` without proper `main` function, the error will happen:

```
java -cp target/entry-point-0.0.1.jar Wall
```

If you inspect the `src/main/java/Wall.java` file you will notice that the `main` function is missing `String[] args`.
