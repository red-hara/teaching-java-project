# Behavior is promise

When working with code, the developer works with promises about its behavior.
In this example three implementers of `Compare` interface are present:
- `Good`
- `Bad`
- `Ugly`

They implement the `maximum` method, which, according to its name, should calculate the maximum between two given values.
Unfortunately, the `Bad` instance is broken, it returns the minimum value instead.
The `Ugly` is so utterly broken, that it terminates program execution.

## Running this example

```
mvn package
java -cp target/behavior-as-promise-0.0.1.jar UsingBehavior
```
