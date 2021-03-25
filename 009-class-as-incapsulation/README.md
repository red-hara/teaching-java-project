# Class as implementation encapsulation

Class may hide its internal implementation using `access modifiers`.
There are three basic modifiers:
- `public`
- `protected`
- `private`

The `public` means that anybody can access such fields, the `private` - that only this particular class instance.
`protected` means that both class instances and class's heir may.

Marking fields as `private` while marking `get...` methods as `public` is a sign of good manners.
This way developer may change his `private` fields anyway they like without actually breaking behavior of class.

In this example developer may change name of `value` to something else, and no change will happen _outside_ of class.
All dependencies will still call the same old `getValue` without bothering that there is no `value` anymore.

## Running this example

```
mvn package
java -cp target/class-as-incapsulation-0.0.1.jar UsingIncapsulation
```
