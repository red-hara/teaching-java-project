# Class as behavior

Classes may serve as struct behavior specification.
Functions in class not marked with `static` keyword are actually its _methods_.
Method is called on specific class instance, in other words on an object created by class specification.

Each method has access to his object's fields.
They can be accessed either by using `this.field` notation or by `field` name itself.

## Running this example

```
mvn package
java -cp target/class-as-behavior-0.0.1.jar UsingBehavior
```

Note that counter objects do not share their `value`s, each has it's own!
