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
public interface Bicycle {
    /*Aşağıda tanımlanan interfaceler metotların sadece gövdelerini oluşturuyor
    Bu interface'i implement(uygulayacak) edecek sınıfın mutlaka bu metotları override
    etmesi şarttır.
    */
    void changeCadence(int newValue);
    
    void changeGear(int newValue);
    
    void speedUp(int increment);
    
    void applyBrakes(int decrement);
    
}
