/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadevrensekerornek1;

/**
 *
 * @author 47683450074
 */
public class SadEvrenSekerOrnek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calisan ali=new Calisan();
        ali.boy=170;
        ali.kilo=80;
        ali.yas=22;
        ali.maas=100;
        System.out.println("Alinin yaşı : "+ali.yas+" Alinin kilosu : "+ali.kilo+" Alinin boyu : "+ali.boy+" Alinin maaşı : "+ali.maas);
        Calisan veli=new Calisan();
        veli.boy=210;
        veli.yas=34;
        veli.kilo=90;
        veli.maas=200;
        System.out.println("Velinin yaşı : "+veli.yas+" Velinin boyu : "+veli.boy+" Velinin kilosu : "+veli.kilo+" Velinin maaşı : "+veli.maas);
        ali.yemek();
        veli.yemek();
        ali.zamYap(30);
        veli.zamYap(30);
        System.out.println("Alinin Yaşı : "+ali.yas+" Alinin kilosu : "+ali.kilo+" Alinin Boyu : "+ali.boy+" Alinin zamlı maaşı : "+ali.maas);
        System.out.println("Velinin Yaşı : "+veli.yas+" Velinin boyu : "+veli.boy+" Velinin kilosu : "+veli.kilo+" Velinin zamlı maaşı : "+veli.maas);
    }
    
}
