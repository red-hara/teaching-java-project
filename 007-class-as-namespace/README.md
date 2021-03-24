# Class as namespace

In Java class also may be seen as a namespace.
In such case it is used as schematics for `static` fields allocation.

The `static` keyword means that such a field belongs to class itself, not to the object created based on class specification. 

The `Namespace` example class provides access to:
- field `counter` with default value `42`;
- function `printHello`, which returns nothing;
- function `getGreeting(String name)`, which returns `String`.

In this case `counter`, `printHello` and `getGreeting` belong to `Namespace` namespace.
The most noticeable example of such a pattern is `java.util.Arrays`, providing access to various useful methods.

## Running this example

```
mvn package
java -cp target/class-as-namespace-0.0.1.jar UsingNamespace
```
