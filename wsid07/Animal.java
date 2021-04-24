/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsid07;

/**
 *
 * @author HP
 */
public class Animal {
public void makeNoise() {
System.out.println(" talk");
}
}
class Dog extends Animal {
@Override
public void makeNoise() {
System.out.println(" Bark");
}
}

