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
public class Bicycle {
    int cadence=0;
    int speed=0;
    int gear=1;
    //Yukarıda propertilerimizi(özelliklerimizi) tanımlıyoruz.
    void changeCadence(int newValue)//Bu metot Cadence özelliğini değiştiren metot
    {
    cadence=newValue;//Metotdan alınan new value değeri cadence özelliğine atanıyor.
    }
    
    void changegear(int newValue)//Bu metot Gear özelliğini değiştiren meotot
    {
    gear=newValue;//Metotdan alınan new value değeri cadence özelliğine atanıyor.
    }
    void speedUp(int increment)//Bu metot Hızı arttırmaya yarıyor.
    {
    speed=speed+increment;//Belirtilen increment değeri metot her çağrıldığında speed özelliğine ekleniyor.
    //speed+=increment;   Bir üst satırdaki ifade yandaki şekildede yazılabilir.
    }
    void applyBrakes(int decrement)//Bu metot hızı azaltmaya yarıyor.
    {
    speed=speed+decrement;//Belirtilen decrement değeri metot her çağrıldığında speed özelliğini eksiltiyor.
    //speed-=decrement;   Bir üst satırdaki ifade yandaki şekildede yazılabilir.
    }
    
    void printStates()//Bu metot kullanıcıya bilgi verme amaclıyla tüm özelliklerin o anki değerlerini ekrana yazdırır.
    {
        System.out.println("cadence:" +
        cadence + "speed:" +
        speed + "gear:" +gear);
    }
}
