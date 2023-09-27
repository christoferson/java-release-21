# java-release-21
Java SDK 21


[playground](https://dev.java/playground/)

[github/java](https://github.com/java)

```
public interface SequencedCollection<E> extends Collection<E> {

    SequencedCollection<E> reversed();

    default void addFirst(E e) { throw new UnsupportedOperationException(); }

    default void addLast(E e) { throw new UnsupportedOperationException(); }

    default E getFirst() { return this.iterator().next(); }

    default E getLast() { return this.reversed().iterator().next(); }

    default E removeFirst() { ... }

    default E removeLast() { ... }

}
```

```
public interface SequencedSet<E> extends SequencedCollection<E>, Set<E> {
	
	SequencedSet<E> reversed();
	
}
```


```
public interface SortedSet<E> extends Set<E>, SequencedSet<E> {
}
```