// program To Implement superkeyword

class A{
    int x =100;
    public void display(){
        System.out.println("I am From Class A");
    }
}
class B extends A{
    int x = 200;
    public void display(){
        System.out.println("X from class A "+ super.x);
        super.display();
        System.out.println("I Am From Class B");
    }
     
}


public class superkeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    } 
}
