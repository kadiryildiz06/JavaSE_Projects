/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorialclassexample;

/**
 *
 * @author 47683450074
 */
public class JavaTutorialClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //İki tane  Bicyle sınıfından Bicycle objesi oluşturalım.
        
        Bicycle bike1=new Bicycle();
        Bicycle bike2=new Bicycle();
        
        //Şimdi bu objeler üzerinde metotlarımızı çağıralım
        
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changegear(2);
        bike1.printStates();
        
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changegear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changegear(3);
        bike2.printStates();
    }
    
}
