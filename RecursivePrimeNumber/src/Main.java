
import java.util.Scanner;
public class Main {
    static int prime(int n,int j){
if(j==0){
    return 0;
}
        if(j == 1) {
            return 1;
        }
    else{
   if(n % j == 0) {
       return 0;
   }
   else{
       return prime(n,j-1);
   }
    }
    }


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int x = scan.nextInt();
        int isPrime;


        isPrime = prime(x,x-1);
        if(isPrime == 1){
            System.out.println(x + " asal sayıdır.");
        }
        else{
            System.out.println(x +" asal değildir.");
        }

    }
}
