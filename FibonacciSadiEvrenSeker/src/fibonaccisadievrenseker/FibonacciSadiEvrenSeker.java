/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisadievrenseker;

/**
 *
 * @author 47683450074
 */
public class FibonacciSadiEvrenSeker {

    /**
     * @param args the command line arguments
     */
    //Recursive fibonacci
    
   public static int recursivefibonacci(int x)
   {
       if (x==1) return 1;
       if (x==0) return 1;
     return recursivefibonacci(x-1)+recursivefibonacci(x-2);
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.out.println("Fibonacci sayısının "+i+". terimi :"+recursivefibonacci(i));
        }
       int ilkSayi=1;
       int ikinciSayi=1;
       int sonuc;
        for (int i = 1; i < 10; i++) {
            int c;
            c=ilkSayi+ikinciSayi;
            ilkSayi=ikinciSayi;
            ikinciSayi=c;
            System.out.println("Fibonacci dizimizin"+i+". terimi "+c);
        }
       
    }
    
    
    
}
