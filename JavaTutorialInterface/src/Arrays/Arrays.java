/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;
/**
 *
 * @author 47683450074
 */
public class Arrays {
    public static void main(String[] args) {
        int a[]={3,4,5,6,7,8,9,10};
        //int b[]=a;
//        for (int i = 0; i < b.length; i++) {
//        System.out.println("b[] dizisinin"+i+". elemanı"+b[i]);    
//        }
        //b[2]=99;
        System.out.println("A'da değişim olmuş mu?"+a[2]);
        /*Burda biz sadece B nin 2. index elemanı değiştirdiğimizi düşünüyoruz
        Fakat a diziside b diziside bellekte aynı yeri gösterdiği için birinde yapılan
        değişiklik diğerinide etkiliyor.Bu tür kopyalamalara Shallow copy denir.*/
        
        
        /*Deep copy ise farklı bellek bölgelerinde bulunan nesneleri ifade etmektedir.
        Bu yolla dizilerden birinde olan değişklik diğer diziyi etkilememktedir.
        */
        int b[]=new int[a.length];
        System.arraycopy(a, 0, b, 0, 7);//1-hangi diziden kopyalama yapılacak
                                        //2-Kaynak dizinin kaçıncı elemanından başlanacak.
                                        //3-Hangi diziye kopyalanacak.
                                        //4-Hedef dizinin kaçoncı indexinden başlanacak
                                        //5-Hedef diziye kaç eleman kopyalanacak
         b[2]=24;                               
        for (int i = 0; i < b.length; i++) {
            System.out.println("B'nin "+i+". elemanı"+b[i]);
        }
        System.out.println("A'da değişim varmı"+a[2]);
        
        
        //Bu alan tek satırda if statement yazımı için ayrılmıştır.
        
        int value1=1;
        int value2=2;
        int result;
        boolean someCondition=false;
        result =someCondition ? value1:value2;
        System.out.println(result);

        
        //Bu alan instanceof örneği için ayrılmıştır.
        Parent obj1=new Parent();
        Parent obj2=new Child();
        
        System.out.println("obj1 instanceof Parent:"+(obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child:"+(obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface:"+(obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent:"+(obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child"+(obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface:"+(obj2 instanceof MyInterface));

        //Bu alan Bitwase operatörleri için ayrılmıştır.
        int bx=13;//Onluk tabandan 2 lik tabana cevirirsek 1101b; >> 1 (1 bit sağa kaydırma) Sola 1 tane 0 eklenecek 0110 olur.
                                                                //<< 1 (1 bit sola kaydırma) sağa 1 tane 0 eklenecek 11010 olur.
        System.out.println("Shift right " + (bx>>1));
        System.out.println("Shift left " + (bx<<1));
        /* 
         & (ve) operatörü    | (veya) operatörü  ^ (XOR) operatörü
        
        */
        System.out.println("bx ve 7 sayısını VE işleminde tabi tuttuğumuzda: "+(bx & 7));
        System.out.println("bx ve 7 sayısını VEYA işlemine tabi tuttuğumuzda: "+(bx | 7));
        System.out.println("bx ve 7 sayısını XOR işlemine tabi tuttuğumuzda: " +(bx ^ 7));
    }       

}
    class Parent {}
    class Child extends Parent implements MyInterface {}
    interface MyInterface {}
