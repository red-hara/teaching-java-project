# Figure info example

In this example one can get quadrangle specification by submitting its sides.
This example relies on several approaches:
- Description of figure is stored in specified class instance;
    - The instance has `private` fields and public getters/setters;
    - The constructor initializes the instance with default values.
- The input reading is done via chaining `System.in`, `InputStreamReader` and `BufferedReader`;
- The `static calculateQuadrangleInfo` may raise _runtime exception_, the `IllegalArgumentException`;
- The figure is considered a rhombus if it is a kite and a parallelogram. 

## Running this example

```
mvn package
java -jar target/figure-example-0.0.1.jar
```
