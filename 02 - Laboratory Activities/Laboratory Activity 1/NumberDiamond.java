import java.util.Scanner;

public class NumberDiamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for n: ");
        int n = sc.nextInt();
        
        //top half of the diamond
        for (int i = 1; i <= n; i++){
            //print spaces
            for(int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            
            //print numbers
            for (int j = 1; j <= (2*i - 1); j++){
                System.out.print(i);
            }
            
            System.out.print("\n");
        }
        
        //bottom half of the diamond
        for (int i = n - 1; i >= 1; i--){
            //print spaces
            for (int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }
            
            //print numbers
            for (int j = 1; j <= (2*i - 1); j++){
                System.out.print(i);
            }
            
            System.out.print("\n");
        }
        
    }
}