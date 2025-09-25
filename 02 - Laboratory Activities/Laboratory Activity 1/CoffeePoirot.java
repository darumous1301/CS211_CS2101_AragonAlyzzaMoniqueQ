import java.util.Scanner;

public class CoffeePoirot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Coffee Poirot, Beika City!\nPlease choose from our menu:");
        System.out.println("1 - Coffee\n2 - Tea\n3 - Smoothie\n4 - Exit (Checkout)\n");
        
        int[] orderList = new int[100];
        
        for(int i = 0; i < 100; i++){
            System.out.print("Enter your beverage: ");
            orderList[i] = sc.nextInt();
            
            if (orderList[i] > 4 || orderList[i] < 1){
                System.out.println("Invalid choice, please try again.");
            }
            
            if (orderList[i] == 4){
                break;
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < orderList.length; i++){
            switch(orderList[i]){
                case 1:
                    System.out.println("Bitter but energizing!");
                    break;
                case 2:
                    System.out.println("Soothing and calming!");
                    break;
                case 3:
                    System.out.println("Cold and refreshing!");
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("\nThank you for visiting Coffee Poirot!");
        
        sc.close();
    }
}