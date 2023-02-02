class parent{
    void parentMethod(){
     System.out.println("This Is Parent Method");
    }
}
class child  extends parent {
 void childMethod(){
     System.out.println("This Is Child Method");
    }

}

public class simpleInheritance {
   public static void main(String[] args) {
    child c = new child();
    c.parentMethod();
    c.childMethod();

   }
}
