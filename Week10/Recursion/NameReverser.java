package Week10.Recursion;

public class NameReverser {

    public static void reverseName(String name) {
        if(name.length() <= 1) {
            System.out.println(name);
            return;
        } else {
            System.out.println(name.charAt(name.length() - 1));
            reverseName(name.substring(0, name.length() - 1));
        }
    }
    public static void main(String[] args) {
        reverseName("Sean");
    }
}
