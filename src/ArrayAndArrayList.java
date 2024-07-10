import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        // C1 Khai báo và khởi tạo mảng số nguyên có kích thước 5
        int[] numbers = new int[5];
        numbers[0] = 10; // Gán giá trị 10 cho phần tử đầu tiên của mảng
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        int firstNumber = numbers[0]; // Truy cập phần tử đầu tiên của mảng
        System.out.println("First number " + firstNumber);

        // C2 Khai báo và khởi tạo mảng với các giá trị cụ thể
        int[] predefinedNumbers = {1, 2, 3, 4, 5};

        //for với mảng
        //C1 foreach
        System.out.println("Ptu trong mang");
        // for (int item : predefinedNumbers) {
        //     System.out.println(item);
        // }
        // System.out.println();


        //C2 for bình thường
        for (int i = 0; i <= predefinedNumbers.length -1 ; i++){
            System.out.println(predefinedNumbers[i]);
        }

        
        //ArrayList
        // Khai báo và khởi tạo ArrayList lưu trữ số nguyên
        ArrayList<Integer> numbersArrList = new ArrayList<>();

        // Thêm phần tử vào ArrayList
        numbersArrList.add(1);
        numbersArrList.add(2);
        numbersArrList.add(3);
        numbersArrList.add(9);

        numbersArrList.add(10);
        numbersArrList.add(12);



        // Truy cập một phần tử trong ArrayList
        int firstNumberfromArrList = numbersArrList.get(0); // Truy cập phần tử đầu tiên

        // Xóa phần tử trong ArrayList
        numbersArrList.remove(2); // Xóa phần tử đầu tiên

        // Lấy kích thước của ArrayList
        int size = numbersArrList.size();
    }
}
