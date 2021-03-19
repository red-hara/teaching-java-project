# Packaging

Java software is often distributed in compiled way.
Having pile of `.class` files as a distribution is not quite nice.
It's much nicer to have them in one single place.

Such place in most cases is the `.jar` file.
It is basically `.zip` archive with additional (optional) stuff inside.

To create such `.jar` with Maven use the following command:

```
mvn package
```

The created `.jar` file will contain compiled `Demo.class` supplemented with `META-INF` (meta information) subfolder.
To execute specific `.class` file in this archive use

```
java -cp target/packaging-with-maven-0.0.1.jar Demo
```
