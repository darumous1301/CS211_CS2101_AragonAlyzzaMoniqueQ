import java.util.Scanner;

class PartyCone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Diameter of the cone's base: ");
        double diameter = sc.nextDouble();
        
        System.out.print("Height of the cone: ");
        double height = sc.nextDouble();
        
        double radius = diameter / 2.0;
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
        
        System.out.printf("Surface Area is %.4f \n", surfaceArea);
        System.out.printf("Volume is %.4f", volume);
        
        sc.close();
    }
}

