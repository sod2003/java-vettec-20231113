package Week08.FunctionalInterfaces;

public class FindBiggestInteger implements FindBiggest<Integer> {
    @Override
    public Integer compare(Integer item1, Integer item2, Integer item3) {
        Integer first = Integer.max(item1, item2);
        return Integer.max(first, item3);
    }
}