public class factorial{

    public static int fact(int n){

        if(n<1){
            return 1;
        }
        if (n==0){
            return 1;
        }
        else{
           return n*fact(n-1);
        }
     }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Factorial is "+ fact( i));
    }

}



