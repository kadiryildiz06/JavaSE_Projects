/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassExample;

/**
 *
 * @author 47683450074
 */
public class DataStructure {
    private final static int SIZE=15;//Bir alt satırda oluşturacağımız Array'in eleman sayısını tespit ediyoruz.
    private int[] arrayOfInts=new int[SIZE];//Burada SIZE boyutunda integer tipinde bir dizi oluşturuyoruz.
    
    public DataStructure()
    {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i]=i;
        }
    }
    
    public void printEven()
    {
    DataStructureIterator iterator=this.new EvenIterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next()+" ");
    }
        System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer>{};
    
    
    private class EvenIterator implements DataStructureIterator{
    
    private int nextIndex=0;
    public boolean hasNext(){return (nextIndex<=SIZE-1);}
    public Integer next(){
    Integer retValue=Integer.valueOf(arrayOfInts[nextIndex]);
    nextIndex+=2;
    return retValue;
    }
    }
    }

