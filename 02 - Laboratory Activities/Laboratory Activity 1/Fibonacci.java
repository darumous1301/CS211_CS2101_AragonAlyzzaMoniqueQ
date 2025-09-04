import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();  
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        
        input.close();
    }
}