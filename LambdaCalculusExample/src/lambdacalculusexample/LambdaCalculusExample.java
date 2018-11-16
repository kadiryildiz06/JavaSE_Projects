/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdacalculusexample;

import java.util.Arrays;
import java.util.List;


/**
 *
 * @author 47683450074
 */
public class LambdaCalculusExample {

    interface lambda{
    int calistir(int x,int y);
    }
    interface lambda2{ 
        int calistir2(int x);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        lambda l=(x,y)->x*y;
//        System.out.println(l.calistir(5,6));
//        lambda2 l2=x -> x * x ;
//        System.out.println(l2.calistir2(5));
      List<Integer> intSeq=Arrays.asList(1,2,3);
      intSeq.forEach(System.out::println);/*Metot referansını geçirmek için :: işareti kullanılır
      Kullanım biçimi 
      static          ClassName::Static methodName     String::valueOf
      constructor     ClassName::new                   ArrayList::new
      specific object objectreferance::MethodName      x::ToString
      instance
      arbitrary object ClassName::InstanceMethodName   Object::toString  
      of a given type
      */
//      intSeq.forEach(x->{
//          x+=2;
//          System.out.println(x);
//      });


/*
JAVADA STREAM YAPISI

Bir stream yapısı üç bileşenden oluşur.
1-Kaynak(dizi,collection,giriş/çıkış(I/O),veya bir üreteç fonksiyonu)
2-Bir işlem
3-Sonlandırma işlemi
*/
List<Integer> list=Arrays.asList(1,2,3,4);
int sum=list.stream().map(x->x*x).reduce((x,y)->x+y).get();
        System.out.println(sum);
    }
    
}
