/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorialinterface;

/**
 *
 * @author 47683450074
 */
public class JavaTutorialInterface {

    
        int cadence=0;
        int speed=0;
        int gear=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BicycleImplement bike1=new BicycleImplement();
        bike1.cadence=10;
        bike1.gear=10;
        bike1.speed=20;
        
        bike1.changeCadence(30);
        bike1.changeGear(12);
        bike1.applyBrakes(2);
        bike1.speedUp(5);
        bike1.printStates();
    }

    
    
}
