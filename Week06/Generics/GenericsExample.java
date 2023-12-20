package Week06.Generics;
import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        //Without generics, you need to cast a String.
        ArrayList list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

        //With generics, code does not require casting.
        ArrayList<String> genericList = new ArrayList<String>();
        genericList.add("hello");
        String s2 = genericList.get(0);   // no cast
    }
}