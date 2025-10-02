import java.util.Scanner;

//int total_Price, payment, change, peso
//IF THEN to verify if the payment < total_Price || if equals || if theres a change
//FOR EACH inside the else statement to breakdown the peso
//int money to temporary hold current peso
//int count to store quotient of change / current money
//IF statement to verify if count > 0 
//print specific peso count, the peso, and statement to check if it is a bill(money > 20)or coin(money <= 20)

public class LilycoveDepartmentStore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_Price = 0;
        System.out.print("Enter total: ");
        total_Price = sc.nextInt();
        
        int payment = 0;
        System.out.print("Your payment: ");
        payment = sc.nextInt();
        
        int change = payment - total_Price;
        int[] peso = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
        
        if(payment < total_Price){
            System.out.println("You don\'t have enough money.");
        }else if(payment == total_Price){
            System.out.println("Thank you for shopping!");
        }else{
            System.out.printf("Your change is %d. Here\'s your change:\n", change);
             for (int money : peso) {
                 int count = change / money;
                 if (count > 0) {
                     System.out.printf("%d %d-peso %s\n", count, money, money > 20 ? "bill" : "coin");
                     change %= money;
                 }
             }
        }
        
        sc.close();
    }
}
