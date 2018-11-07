/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorialconstructor;
class Insan{
int boy;
int kilo;
int yas;

    public Insan(int boy, int kilo, int yas) {
        this();
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
    }
public Insan()//Constructorlar class ile aynı isme sahiptir.Ve geri dönüş tipi yoktur.
{
    System.out.println("Bir insan objesi oluşturuldu");
}
}
/**
 *
 * @author 47683450074
 */
public class JavaTutorialConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Insan ali=new Insan();//Default Constructor
        Insan veli=new Insan(180,50,20);
        ali.boy=180;
        ali.kilo=80;
        ali.yas=24;
    }
    
}
