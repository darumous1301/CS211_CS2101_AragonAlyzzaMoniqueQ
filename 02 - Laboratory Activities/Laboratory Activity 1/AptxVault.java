import java.util.Scanner;

public class AptxVault{
    
    public static void getPasscodes(Scanner sc, int[] passcode, int n){
        for (n = 0 ; n < 3 ; n++){
            System.out.print("Enter passcode " + (n + 1) + ": ");
            passcode[n] = sc.nextInt();
        }
    }
    
    public static boolean isValidPasscodes(int x, int y, int z){
        return ((x >= 450 && x <= 3000) && (y >= 450 && y <= 3000) && (z >= 450 && z <= 3000));
    }

    public static int sum(int[] passcode){
        
        int sum = 0;
        for (int i : passcode){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] passcode = new int[3];
        int n = 0;
        
        getPasscodes(sc, passcode, n);
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        for (n = 0; n < 3; n++){
            x = passcode[0];
            y = passcode[1];
            z = passcode[2];
        }
        
        boolean validity = isValidPasscodes(x, y, z);
        
        int result = sum(passcode);
    
        if (validity == true && result == 4869){
            System.out.printf("Vault unlocked with: %d, %d, %d", x, y, z);
        }else{
            System.out.print("Vault remains locked.");
        }
        
        sc.close();
    }
}