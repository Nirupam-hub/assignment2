import java.util.Scanner;
public class Sumofdigits{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int digit, sum=0;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        n.close();
    }
}