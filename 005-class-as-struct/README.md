# Classes

Our first look at classes in Java will be from the structure point of view.
Class can be viewed as structure specification.

For example, class in `Storage.java` describes structures with two fields:
- `name` of type `String`
- `content` of type `String` too.

When calling `new Storage()` one uses that specification to construct concrete structure.
That structure later may be used as a whole; individual pieces (fields) may be used too:

```.java
Storage struct = new Storage();
struct.content = "John Doe";
```

## Running this example

```
mvn package
java -cp target/class-as-struct-0.0.1.jar Classes
```

