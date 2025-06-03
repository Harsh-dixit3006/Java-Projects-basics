import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the No of Fib Digits you Want: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        fib(a);

    }
    public static void fib(int x ){
        int num1=0, num2=1, num3;
        System.out.print(num1 );
        System.out.print(" "+num2 );
        while((x-2)>0 ) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+ num3);
            x--;
        }
    }
}


