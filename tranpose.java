import java.util.Scanner;
public class tranpose {
    public static void main(String[]args)
    {
        Scanner ob = new Scanner (System.in);
int arr[][]= new int [2][3];
System.out.println("enter the elements");
for(int i=0;i<2;i++)
{
    for(int j=0;j<3;j++)
    {
        arr[i][j]= ob.nextInt();
    }
}
               System.out.println("The transpose is:");
               for(int i=0;i<3;i++)
               {
                for(int j=0;j<2;j++)
                {
                    System.out.print(arr[j][i]+"\t");
                }
                System.out.println();
               }
    }
}
