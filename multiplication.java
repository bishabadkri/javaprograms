 import java.util.Scanner;
public class multiplication{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int first[][]=new int[2][2];
        int second[][]=new int[2][2];
        
         int multiply[][]=new int[2][2]; 
        
        System.out.print("Enter 1st Matrix Elements : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                first[i][j]=scan.nextInt();       
            }
        }
        System.out.print("Enter 2nd Matrix Elements : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                second[i][j]=scan.nextInt();       
            }
        }
        int sum=0;
		for ( int i = 0 ; i < 2 ; i++ )
		{
			for (int j = 0 ; j < 2 ; j++ )
			{   
				
			   for (int k = 0 ; k < 2 ; k++ )
			   {
				  sum = sum + first[i][k]*second[k][j];
			   }
 
			   multiply[i][j] = sum;
			   sum = 0;
			}
		}
		System.out.println("Product of entered matrices:-");
		for(int i=0;i<2;i++){	
            for(int j=0;j<2;j++){
				System.out.print(multiply[i][j]+"\t");
			}
            System.out.print("\n");
        }
    }
}
