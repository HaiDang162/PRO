/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author MSIGAMING
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        saveAStudent();
        inputAStudent();
    }
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        // lưu ý phải nhập chuỗi trước số nếu ko sẽ bị trôi lệnh
        System.out.print("Input Id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    public static void saveAStudent() {
        Student an = new Student("SE161495", "LÃ HẢI ĐĂNG", 2002, 6.9);
        an.showProfile();
    }
}
