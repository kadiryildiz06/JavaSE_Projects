/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclassesexample;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

class Insan{
    int boy;
}

class Ogrenci extends Insan implements Cloneable{

    Object kopyala() throws CloneNotSupportedException
    {
    return this.clone();
    }
    Ogrenci kopyala2(){
    Ogrenci temp=new Ogrenci();
    temp.boy=this.boy;
    return temp;
    }
}

/**
 *
 * @author 47683450074
 */
public class ObjectClassesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Insan ali=new Insan();
        Insan ahmet=ali;//Shallow copy (sığ kopyalama)
        ali.boy=180;
        System.out.println("alinin boyu"+ahmet.boy);
        if (ali==ahmet) {
            System.out.println("Eşitler");
    }
   Ogrenci ayse=new Ogrenci();
   ayse.boy=160;
   Ogrenci fatma=(Ogrenci)ayse.kopyala2();//Deep copy(derin kopyalama)
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy=200;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
}
    
}
