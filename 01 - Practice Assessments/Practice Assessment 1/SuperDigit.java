import java.util.Scanner;

class SuperDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (up to 18 digits): ");
        long x = input.nextLong();  

        if (x < 10) {
            System.out.print("Super digit of " + x + ": " + x);
        } else {
            long sum = x;

            while (sum >= 10) {
                long temp = sum;
                sum = 0;

                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
            }

            System.out.print("Super digit of " + x + ": " + sum);
        }

        input.close();
    }
}
