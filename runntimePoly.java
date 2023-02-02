// Runtime Polymorphism = Method OverRiding

class bikeSpeed{
    public void run(){
        System.out.println("The Bike Is Running");
    }
}

class carSpeed extends bikeSpeed{
    public void run(){
        System.out.println("The Car Is Running");
    }

}

public class runntimePoly {
    public static void main(String[] args) {
        bikeSpeed s1 = new carSpeed();
        s1.run();
    }
}
