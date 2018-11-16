/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdajavatutorialexample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author 47683450074
 */
public class LambdaJavaTutorialExample {

    interface CheckPerson{
    boolean test(Person p);
    }
    
    /*
    Yaklaşım 1:Bir kriterle eşleşen kişileri arayan metot oluşturma    
    */
    public static void printPersonOlderThan(List<Person> roster,int age)
    {
        for (Person p: roster) {
            if (p.getAge()>=age) {
                p.printPerson();
            }
        }
    }
    
    //Yaklaşım 2:Daha Genelleştirilmiş Arama Yöntemleri Oluşturun
    
    public static void printPersonsWithinAgeRange(List<Person> roster,int low,int high)
    {
        for (Person p:roster) {
            if (p.getAge()>=low && p.getAge()<high) {
                p.printPerson();
            }
        }
    
    }
    
    
    /*
    Yaklaşım 3:Yerel Sınıfta Arama Ölçütü Kodunu Belirtme
    Yaklaşım 4:Anonim classda arama ölçütü kodunu belirtme
    Yaklaşım 5: Lambda Expression  ile arama ölçütü kodunu belirtme
    
    */
    public static void printPersons(List<Person> roster, CheckPerson tester)
    {
        for (Person p:roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    //Yaklaşım 6:Lambda İfadeleriyle Standart Fonksiyonel Arayüzleri Kullanın
    
    
    public static void printPersonsWithPredicate(List<Person> roster,Predicate<Person> tester){
        for (Person p:roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
            
        }
    //Yaklaşım 7:Uygulamanız boyunca Lambda ifadeleri kullanın
    public static void processPersons(
    List<Person> roster,
    Predicate<Person> tester,
    Consumer<Person> block)
    {
        for (Person p:roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }
    //Yaklaşım 7:İkinci Örnek
    public static void processPersonWithFunction(
    List<Person> roster,
    Predicate<Person> tester,
    Function<Person,String> mapper,
    Consumer<String> block)
    {
        for (Person p:roster) {
            if (tester.test(p)) {
                String data=mapper.apply(p);
                block.accept(data);
            }
        }
    }
    
    //Yaklaşım 8:Jenerikleri daha kapsamlı bir şekilde kullanın
    public static <X,Y> void processElements(
    Iterable<X> source,
            Predicate<X> tester,
            Function<X,Y> mapper,
            Consumer<Y> block){
        for (X p:source) {
            if (tester.test(p)) {
                Y data=mapper.apply(p);
                block.accept(data);
            }
        }
    
    }

    
    public static void main(String[] args) {
        // TODO code application logic here

    List<Person> roster=Person.createRoster();
        for (Person p:roster) {
            p.printPerson();
        }
        
    //Yaklaşım 1:Bir kriterle eşleşen kişileri arayan metot oluşturma
        System.out.println("Persons older than 20:");
        printPersonOlderThan(roster, 20);
        System.out.println();
    //Yaklaşım 2:Daha Genelleştirilmiş Arama Yöntemleri Oluşturun
        System.out.println("Persons between the ages of 14 and 30;");
        printPersonsWithinAgeRange(roster, 14, 30);
        System.out.println();
      //Yaklaşım 3:Yerel Sınıfta Arama Ölçütü Kodunu Belirtme
     
    //Yaklaşım 5: Lambda Expression  ile arama ölçütü kodunu belirtme  
        System.out.println("Person who are eligible for Selective Service:");
        class CheckPersonEligibleForSelectiveSevice implements CheckPerson{
        public boolean test(Person p)
        {
        return p.getGender()==Person.Sex.MALE
                &&p.getAge()>=18
                &&p.getAge()<=25;
        }
        }
        printPersons(roster, new CheckPersonEligibleForSelectiveSevice());
        System.out.println();
        
        //Yaklaşım 4:Anonim classda arama ölçütü kodunu belirtme
        
        System.out.println("");
    }
    
}
