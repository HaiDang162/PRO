/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author MSIGAMING
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 10, b = 3;
       int swap = a;    
       a = b;
       b = swap;
       int count = 0;
       int k = 1;
        for (int i = a; i <= b; i++) {
            if (  i % 2 == 1){
                System.out.println(i + " ");
                count++;
                k = k*i;
            }
        }
        System.out.println(count);
        System.out.println(k);
}
}
