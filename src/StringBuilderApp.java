public class StringBuilderApp {
    public static void main(String[] args) throws Exception {
        
        //String
        String str = "Hello";
        str = str + " World";
        System.out.println(str);

        //String Builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());



    }   
}
