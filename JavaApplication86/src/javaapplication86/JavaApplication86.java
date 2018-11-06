/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 47683450074
 */
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    static void yaz()
    {
        System.out.println("merhaba dünya");
    }
    static int f(int x)
    {
    return 5*x+10;
    }
    static int g(int x,int y)
    {
    return f(y+2*x);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        yaz();
        System.out.println(g(5,3));
    }
    
}
