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
public class BicycleImplement implements Bicycle{
    int cadence=0;
    int speed=0;
    int gear=1;
    /*
    Burda oluşturuduğumuz sınıf dikkat ederseniz Bicycle interface'ini implemente(uygulamış) etmiş
    Bu işlemle BicycleImplement sınıfı Bicyle inteface'inin tüm metotlarını override edeceğini(içeriğini dolduracağını)
    tahahhüt etmiş oluyor.
    */
    
    @Override
    public void changeCadence(int newValue)
    {
    cadence=newValue;
    }
    
    @Override
    public void changeGear(int newValue)
    {
    gear=newValue;
    }
    @Override
    public void speedUp(int increment)
    {
    speed=speed+increment;
    }
    
    @Override
    public void applyBrakes(int decrement)
    {
    speed=speed-decrement;
    }
    
    void printStates()
    {
        System.out.println("cadence:" +
                cadence+ " speed:"+
                speed+" gear:"+gear);
    }
}
