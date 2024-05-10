/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author MSIGAMING
 */
public class Ws1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input n: ");
//        int n = sc.nextInt();
//        printNofPrime(n);
        System.out.println(" " + isPrime(4));
    }
   
    public static void printNofPrime(int n) {

        int count = 0, i = 2;
        while (count < n) {
            if (isPrime(i) == 1) {
                System.out.println("num: " + i);
                count++;
            }
            i++;    
        }
    }
    public static int isPrime(int n) {
        if (n < 2)
                return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }
}
