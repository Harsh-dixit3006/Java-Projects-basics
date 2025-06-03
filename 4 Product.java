import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first no: ");
        float a= input.nextFloat();
        System.out.print("Enter the second no: ");
        float b = input.nextFloat();
        System.out.println("product of Two No are "+ (a*b) );
        System.out.print("Sum of Two No are "+ (a+b) );
    }
}
