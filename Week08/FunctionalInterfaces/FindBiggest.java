package Week08.FunctionalInterfaces;

/* Functional Interface
 * Has single abstract method
 */
@FunctionalInterface
public interface FindBiggest<T> {
    T compare(T item1, T item2, T item3);
}
