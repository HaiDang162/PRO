/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author MSIGAMING
 */
public class Dog {
    public String name;
    private int yob;
    private double weight;
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    public void bark() {
        System.out.println("Gogogogo.... my name is " + name);
        System.out.println("Gogogogo.... my name is " + yob);
        // ...
    }
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    // vì mặc định thông tin sẽ là giấu, khi mình giao tiếp mình mới bật nó ra
    // chia sẻ thông tin khi đc hỏi, đó chính là method hàm hành động get()
    public int getYob() {
        return yob;
    }
}
