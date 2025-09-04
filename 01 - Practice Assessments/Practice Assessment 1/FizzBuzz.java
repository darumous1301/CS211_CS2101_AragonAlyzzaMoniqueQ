import java.util.Scanner;

class FizzBuzz{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an upper bound: ");
        int upperBound = input.nextInt();
        
        for (int i = 1; i <= upperBound; i++){
            if(i % 3 == 0 || i % 5 == 0){
                if(i % 3 == 0){
                    System.out.println("Fizz");
                }else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
            }else{
                System.out.println(i);
            }
        }

        input.close();
    }
}
