/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varnfun;

import java.util.Scanner;

/**
 *
 * @author MSIGAMING
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int n = getAPositiveInteger();
          System.out.println("Your number: " + n);
          
          printIntegerList(n); // truyền tham trị, pass by value. Value từ n của hàm main() sẽ được ddauw qua ngõ
                               // OOP pass by reference - truyền tham chiếu, con trỏ, địa chỉ
//        playWithInttegers();
//        
//        playWithVariables();
//        
//        playWithDoubles();
//        
//        playWithCharacters();
//        
//        playWithBooleans();

    }
    
    public static int getAPositiveInteger() {
        int n;
        // nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa, name.charAt()
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = sc.nextInt();
        return n; // getAPositiveInteger() = n
    }
    // in n số tự nhiên tính từ 1
    // Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    // đầu vào, mà khác trên data type chứ ko phải khác trên biến
    // được gọi là overload/overloading - quá tải hàm
    // vs. OVERRIDE
    //Polymorphism
    // giống như: 5 ae trên 1 chiếc xe Wave
    public static void printIntegerList(int n) {
        // chỉ có thằng ngáo mới scanf(n) here!!! n đã có value khi xài
        // body of funct. nghiền, trộn xử lí với đầu vào giả định sẽ đưa qua tên gọi
        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) 
            System.out.printf("%d ", i);
        System.out.println(" \n");
            //System.out.println(i + " ")
    }
    // In ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " ");
        }
    }
    
    public static void playWithBooleans() {
        //C: đúng 1, > 0, sai 0
        //Java: đúng: true, sai: false, -> boolean
        boolean marriedStatus = false;
        if (marriedStatus)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    
    public static void playWithCharacters() {
        // 2 byte cho kiểu char, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        // tên thì sao? C: mảng các kí tự, ko primitive, phức tạp
        //              Char name[] = "Ahihi";
        
        String name = "Hoàng Ngọc Trinh"; //loại data type mới hoàn toàn
                                          //phức tạp, do gom n thứ khác
                                          //object data type, học sớm
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("my name as in a lowercase: " + name.toLowerCase());

    }
    
    // Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);
        
        float vat = 0.1F; // 
        System.out.println("vat: " + vat);
    }
    public static void playWithInttegers() {
        int n = 39; // mọi con số, kí tự xuất hiện trong code đc gọi là Literal value
                    // số nguyên xuất hiện trong code mặc định là int
                    System.out.println("n: " + n);
                    
                    long m = 3_000_000_000L; // phân cách literal trong code cho dễ đọc
                    System.out.println("m: " + m);
                    
                    int status = 0xFA; // hệ 16
                    System.out.println("status: " + status);
                    
                    int phone = 010; // 0 hệ 8 octal
                    
                    System.out.println("phone: " + phone);
    }
    
    public static void playWithVariables() {
       // biến là một vùng Ram được đặt tên, chiếm một số byte nhất định tùy loại
       // dữ liệu/ thông tin mà nó sẽ chứa bên trong - data type - hình thức data
       // số, chữ, ảnh ...
       // biến là cách đặt tên cho 1 đại lượng, 1 giá trị đơn, phức
       int age = 20;
       int a = 10, b;
       b = 100;
       // tốn 12 byte trong RAM
        System.out.println("age: " + age); //
        int yob = 2001;
        age = 2021 - yob;
        System.out.println("age again: " + age);
        
        System.out.println("age by using transitive tech: " + (2021 - yob));
        
        System.out.printf("age printed by using %% as in C: %d\n", (2021 - yob));
    }
}



