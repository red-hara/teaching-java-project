# javac

The most basic way of compiling `.java` source code is by using the `javac` command directly.
To compile code in `src/Demo.java` into something, that later can be executed by the Java Virtual Machine execute the following command:

```
javac src/Demo.java -d target
```

The `javac` is the java compiler, it transforms human-readable source code in `src/Demo.java` into virtual machine-readable `Demo.class` file located in specified directory `target`.

To make Java Virtual Machine run that `Demo.class` execute

```
java -cp target Demo
```

The `java` calls starts the Java Virtual Machine and tells it to search given classpath `-cp target` for class `Demo` and to run it.
