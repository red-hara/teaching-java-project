# Interface as common behavior

_Interfaces_ in Java are behavior specifications.
Implementing interface the developer may claim "this class will respond to specified commands".

When using interface, one allows to abstract away implementation details.
Both `ArrayList` and `LinkedList` implement the `List` interface.
In code below one do not care what type of list the function receives, they care about implemented methods only.

```.java
public static void printFirstElement(List list) {
    System.out.println(list.get(0));
}
```

## Running this example

```
mvn package
java -cp target/interface-as-behavior-0.0.1.jar UsingInterface
```

Note, both `BoxPrinter` and `WavyPrinter` implement the `FancyPrinter` interface, so they can interchange each other.
