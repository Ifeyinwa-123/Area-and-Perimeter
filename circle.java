import java.util.Scanner;

public class Circle{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a radius for the circle between 0 and 10(0<r<=10)");
        double radius = scanner.nextDouble();

        if (radius<=0 || radius >10){
            System.out.println("Enter a valid value between 0 and 10 inclusive (0<r<=10)");

        }else{
            double area= Math.PI* Math.pow(radius,2);
            double perimeter=Math.PI *2*radius;

            System.out.printf("Area : %.2f%n", area);
            System.out.printf("Perimeter : %.2f%n", perimeter);
        }

        scanner.close();
    }
}
