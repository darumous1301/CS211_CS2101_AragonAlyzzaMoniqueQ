import java.util.Scanner;

public class EdenAcademy{

    public static int nextMultipleOfFive(int grade) {
        //fuuction to return a the next multiple of five to teh array
        return ((grade / 5) + 1) * 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //get size of grades
        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();
        
        //intialize array of grades, failing grades and passing grades
        int[] grades = new int[n];
        int[] failingGrades = new int[n];
        int[] passingGrades =  new int[n];
        int countPass = 0;
        int countFail = 0;
        
        //FOR LOOP to store grades
        System.out.print("Enter grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            //check if grades is less than 78 and store it in the array of failing grades
            if (grades[i] < 78) { 
                failingGrades[countFail] = grades[i];
                countFail++;
            //if grades is within 78 and 100 perform inner IF-ElSE
            } else if (grades[i] >= 78 && grades[i] <= 100) {
                int nextMultiple = nextMultipleOfFive(grades[i]);
                if (nextMultiple - grades[i] < 3) {
                    passingGrades[countPass] = nextMultiple; 
                } else {
                    passingGrades[countPass] = grades[i]; 
                }
                countPass++;
            }
        }
        
        System.out.println();
        
        if (countPass >= 0) {
            System.out.print("Passed: ");
            for (int i = 0; i < countPass; i++) {
                System.out.print(passingGrades[i] + " ");
            }
        }
       
       if (countFail >= 0) {
            System.out.print("\nFailed: ");
            for (int i = 0; i < countFail; i++) {
                System.out.print(failingGrades[i] + " ");
            }
            System.out.println("\n");
        }
        
        int stellaStar = countPass / 3;
        if (stellaStar >= 0) {
            System.out.println("Stella Stars: " + stellaStar);
        }
        
        int tonitrusBolt = countFail;
        if (tonitrusBolt >= 0) {
            System.out.println("Tonitrus Bolts: " + tonitrusBolt);
        }

        sc.close();
    }
}
