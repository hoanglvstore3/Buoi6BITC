public class WrapperClassApp {
    public static void main(String[] args) {
        //Có 2 cách tạo là sử dụng constructor hoặc phương thức valueOf
        Integer i1 = new Integer(6);
        Integer i2 = new Integer(6);
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);



        // Integer wrapper class example
        Integer intWrapper1 = Integer.valueOf(10); // Tạo một đối tượng Integer từ một giá trị nguyên thủy
        int intPrimitive = intWrapper1.intValue(); // Lấy giá trị nguyên thủy từ đối tượng Integer
        System.out.println("Integer wrapper example:");
        System.out.println("Integer value: " + intWrapper1);
        System.out.println("Integer primitive value: " + intPrimitive);
        System.out.println();

        // CompareTo example
        Integer num1 = Integer.valueOf(15);
        Integer num2 = Integer.valueOf(10);
        int compareResult = num1.compareTo(num2);
        System.out.println("CompareTo example:");
        if (compareResult > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (compareResult < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
        System.out.println();
    }
    
}
