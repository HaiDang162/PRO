/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogmanament;

import Data.Dog;

/**
 *
 * @author MSIGAMING
 */
public class Dogmanament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yob = 2001;
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        chiHu.bark();
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        System.out.println("Show all info by using toString() - a new behavior");
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("NDD detais: " + ngaoDa.toString());
    }
}
