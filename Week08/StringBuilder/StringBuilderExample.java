package Week08.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "String";
        str = str.concat(" another String");
        System.out.println(str);
        
        StringBuilder sb = new StringBuilder("Vanilla");
        sb.append(" and chocolate");
        System.out.println(sb);
        sb.replace(1, sb.length(), "red");
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.insert(3, str);
        System.out.println(sb);
    }
}
