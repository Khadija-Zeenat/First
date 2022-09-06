abstract class A{
       abstract void show();
       void showme()
       {
              System.out.println("How are you");
       }
}
class B extends A{
       void showij()
       {
              System.out.println("Hello World");
       }
}
public class Abstraction {
       public static void main(String[] args)
       {
       B b = new B();
       b.show();
       b.showme();
       A a= new A();
}

       
}
