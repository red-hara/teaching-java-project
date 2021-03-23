# HashMap as struct

In this example we use `HashMap` to store our content.
The _map_ in `HashMap` represents relation between _keys_ and _values_.
We put values `"Demo Storage"` and `"The content that is held in this storage"` into that map under keys `"name"` and `"content"`.

So the map named `storage` contains those pairs:
```
"name"      -> "Demo Storage"
"content"   -> "The content that is held in this storage"
```

So, in theory we might avoid using classes for structures and use HashMaps for this purpose.
It comes with a price, however:
- The compiler can not check names during compilation;
- Searching for the field takes (somewhat) noticeable time;
- It's hard to make the map do something useful;
- There is no type checking.

## Running this example

```
mvn package
java -cp target/hashmap-as-struct-0.0.1.jar UsingHashmap
```

Notice, that thanks to the typo `"conteent"` the printed result is
```
Name of storage is Demo Storage
Content is null
```

This happens because when looking for key `"conteent"` the result is `null`.
```
"name"      -> "Demo Storage"
"content"   -> "The content that is held in this storage"
"conteent"  -> ???
```
