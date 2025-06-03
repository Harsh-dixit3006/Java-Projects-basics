import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double p = input.nextDouble();
        System.out.print("Enter rate: ");
        double r = input.nextDouble();
        System.out.print("Enter time: ");
        double t = input.nextDouble();

        double CI =  p * Math.pow((1+r/100),t );
        System.out.print("Calculated CI = "+ CI );
    }
}




class compound{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = input.nextFloat();
        System.out.print("Enter Rate: ");
        double r = input.nextDouble();
        System.out.print("Enter The time Duration: ");
        double t = input.nextDouble();
        double CI = p* Math.pow(1+r/100,t);

        System.out.println("The calc CI = "+ CI);
        System.out.println("ThankYou!");

    }
}