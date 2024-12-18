
import java.util.Scanner;

/*wap to find the factorial of a number*/
public class factorial{
    public static void main(String[] args) {
        int n,i;
        int f=1;
    Scanner ob = new Scanner(System.in);
        System.out.println("Enter the element");
        n= ob.nextInt();//5
        for(i=1;i<=n;i++)
        {
            f=f*i;
            System.out.println("THe factorial is :"+f);
        }

    }
}