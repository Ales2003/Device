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
public class Phone extends Device {

    private int hourCollCount;

    public Phone(double batteryCharge, double powerConsumption, int hourCollCount) {
        super(batteryCharge, powerConsumption);
        this.hourCollCount=hourCollCount;
    }

    @Override
    public boolean work() {
       System.out.println("Телефон======================");
        while (batteryCharge>=(powerConsumption*2+hourCollCount*0.01)) {
        System.out.print("Телефон работает "+ (++workHours)*60+" минут >>> ");
        batteryCharge-=powerConsumption;
        ;
        }
        System.out.println();
        System.out.println("Время работы телефона "+workHours+" часов");
        System.out.println("Количество звонков: "+workHours*hourCollCount);
        System.out.println("Телефон разрядлится через 2 часа!!!");
        return false;
    }
    
    
    
}
