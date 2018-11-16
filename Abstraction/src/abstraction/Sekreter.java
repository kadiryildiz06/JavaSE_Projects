/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 47683450074
 */
public class Sekreter extends Calisan {
    
    private int sayac=0;
    private String adres;
    int yas;
    boolean sigara;
    public boolean isSigara()
    {
        return sigara;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>0 && yas<150) {
           this.yas = yas;
        }
    }
    
    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }
    public Sekreter(){
    sayac++;
    }
    public void maas(){
        System.out.println("Maas 100");
    }
    
    public final void yetki()
    {
        System.out.println("Yetkimi kimseye devretme");
    }
    
    public static void main(String[] args) {
        Sekreter ayse=new Sekreter();
        Sekreter ali=new Sekreter();
        System.out.println(ali.getSayac());  
        ali.setYas(150);
        System.out.println(ali.getYas());
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
