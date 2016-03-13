/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedevice;

/**
 *
 * @author Алекс1
 */
public class Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Device device = new Device (2.4, 0.9);
        device.work();
        Laptop laptop = new Laptop(4.0, 1.0);
        laptop.work();
        Phone phone = new Phone(5.0, 0.1, 25);
        phone.work();
        TVset tVSet = new TVset (20.0, 1.0);
        tVSet.work();

// TODO code application logic here
    }
    
}
