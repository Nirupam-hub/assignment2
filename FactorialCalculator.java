import java.util.Scanner;
public class FactorialCalculator{
    public static void main(String[] args) {
     Scanner k = new Scanner(System.in);
     System.out.print("enter number: ");
     int number = k.nextInt();
     long factorial = 1;
     int i;
     for(i=1;i<=number;i++){
        factorial*=i;
     }
     System.out.println("factorial of "+ number + "is" + factorial);
     k.close();
    }
}

