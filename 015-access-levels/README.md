# Accessing data in code blocks

Let's name code inside pair of `{` and `}` a code block.
Then, code inside code block has access to fields outside, but not to fields in inner blocks.

```
{
    int outer;
    {
        int inner;
        // Here we have access to outer and inner.
    }
    // Here we have access to outer only.
}
```

## Running this example:

```
mvn package
java -jar target/access-0.0.1.jar
```
