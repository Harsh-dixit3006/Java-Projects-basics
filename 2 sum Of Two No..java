import java.util.Scanner;

class _2_SumOfTwoNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calc ");
        System.out.print("Enter the first no: ");
        int first = input.nextInt();
        System.out.print("Enter the second no: ");
        int second = input.nextInt();
        int sum= first + second ;
        System.out.println("The sum of given no's are: "+ sum);
    }

}
