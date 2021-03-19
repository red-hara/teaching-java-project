# Building with Ant

`javac` is pretty convenient, especially when working with single source file.
In case of tens-hundreds on source files calling `java` for every one of them may become tiring.

Developers soon decided to automate the process.
In sake of simplicity we will skip early attempts (`make` based) and start with the Ant build system.

The `ant` command reads the `build.xml` specification and executes specific targets.
For example, try executing the `greeting` target:

```
ant greeting
```

If default target is specified, Ant will run it when started with no arguments.
In this `build.xml` the default target is `compile`, so when the `ant` command is executed the Ant will execute everything in `compile` section.

```
ant
```

To execute compiled `Demo.class` execute

```
java -cp build Demo
```

Writing `build.xml` by hand is not necessary nowadays, the Integrated Development Environment generates them automatically.
