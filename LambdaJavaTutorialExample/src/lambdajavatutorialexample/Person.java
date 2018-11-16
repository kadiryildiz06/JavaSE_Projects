/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdajavatutorialexample;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 47683450074
 */
public class Person {
    
    public enum Sex{
    MALE,FAMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String nameArg, LocalDate birthdayArg, Sex genderArg, String emailArg) {
        this.name = nameArg;
        this.birthday = birthdayArg;
        this.gender = genderArg;
        this.emailAddress = emailArg;
    }

    public int getAge()
    {
    return  birthday
            .until(IsoChronology.INSTANCE.dateNow())
            .getYears();
    }
    
    public void printPerson(){
        System.out.println(name+" "+this.getAge());
    }
    
    public Sex getGender(){
    return gender;
    }
    public String getName(){
    return name;
    } 
    public String getEmailAddress(){
    return emailAddress;
    }
    public LocalDate getBirthday(){
    return birthday;
    }
    public static int compareByAge(Person a,Person b)
    {
    return a.birthday.compareTo(b.birthday);
    }
    
    public static List<Person> createRoster(){
    List<Person> roster=new ArrayList<>();
    roster.add(new Person("Fres",
            IsoChronology.INSTANCE.date(1980,6,20),
            Person.Sex.MALE,
            "fred@example.com"));
    roster.add(new Person("Jane",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Person.Sex.FAMALE,
            "jane@example.com"));
    roster.add(new Person("George",
            IsoChronology.INSTANCE.date(1991, 8, 13),
            Person.Sex.MALE,
            "george@example.com"));
    roster.add(new Person("Bob",
    IsoChronology.INSTANCE.date(2000, 9, 12),
    Person.Sex.MALE,
    "bob@example.com"));
    
    return roster;
    }
        
}
