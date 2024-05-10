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
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        System.out.println("After overweight");
        chiHu.setNewWeight(5);  
        chiHu.bark();
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("NĐ YOB: " + ngaoDa.getYob());
    }
}
