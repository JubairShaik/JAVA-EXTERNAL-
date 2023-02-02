// Thread?

class Thread1 extends Thread{
    public void run(){
        for(int i=0 ; i<=5 ; i++){
            System.out.println("InsideRun");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        obj.start();
        for(int j= 0; j<=5;j++){
            System.out.println("InsideMain");
        }
    }
    
    
}
