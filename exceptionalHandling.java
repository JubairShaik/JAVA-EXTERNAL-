// exceptionalHandling Program


public class exceptionalHandling {
    public static void main(String[] args) {
        int a=5 ,b=0;
        try{
            int c= a/b;
            System.out.println(c);
        }
        catch ( ArithmeticException ae){
            System.out.println("can't divide by Zero");

        }
        finally{
            System.out.println("Bye");
        }
    }
}
