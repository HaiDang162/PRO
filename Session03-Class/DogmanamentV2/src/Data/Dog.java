/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
public class Dog {
    public String name;
    private int yob;
    private double weight;
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void bark() {
        System.out.println("Gogogogo.... my name is " + name);
        System.out.println("Gogogogo.... my name is " + yob);
    }
    public void setNewWeight(double weight) {
        this.weight = weight;
    }
}
