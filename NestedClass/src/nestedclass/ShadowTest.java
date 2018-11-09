/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclass;

/**
 *
 * @author 47683450074
 */
public class ShadowTest {
    public int x=0;
    class FirstLevel{
        public int x=1;
        void methodFirstLevel(int x){
            System.out.println("x= "+x);
            System.out.println("this.x= "+this.x);
            System.out.println("ShodowTest.this.x = "+ShadowTest.this.x);
        }
    }
}
