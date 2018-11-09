/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnonymousClass;

/**
 *
 * @author 47683450074
 */
public class HelloWorldAnonymousClass {
    
    interface HelloWorld
    {
    public void greet();
    public void greetSomeone(String someone);
    }
    
    public void sayHello()
    {
    class EnglishGreeting implements HelloWorld{
    String name="World";
    public void greet(){
    
        greetSomeone("world");
    }
    public void greetSomeone(String someone)
    {
        name=someone;
        System.out.println("Hello "+name);
    }
    }
    HelloWorld englishGreeting =new EnglishGreeting();
    
    HelloWorld frenchGreeting=new HelloWorld(){
    String name="tout le monde";
    public void greet(){
        greetSomeone("tout le monde");
    }
    
    public void greetSomeone(String someone)
    {
        name=someone;
        System.out.println("Salut "+name);
    }
    };
    
    HelloWorld spanishgreeeting=new HelloWorld()
    {
    String name="mundo";
    public void greet()
    {
        greetSomeone("mundo");
    }
    public void greetSomeone(String someone)
    {
    name=someone;
        System.out.println("Hola, "+name);
    }
    };
    
    englishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
    spanishgreeeting.greet();
    }
            
    }
    

