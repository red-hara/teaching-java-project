# Runnable `.jar`

As we mentioned before, the `.jar` file contains additional information.
Such information may include the entry point location info too.

To generate proper `MANIFEST.MF` in `META-INF` one may use maven plugins, such as
- `maven-jar-plugin`
- `maven-assembly-plugin`
- `maven-shade-plugin`

In this example one relies on the jar plugin.
It requires one to specify the entry point AKA `mainClass`.

## Running this example

```
mvn package
java -jar target/runnable-jar-0.0.1.jar
```
