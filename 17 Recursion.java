import java.util.Scanner;

class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int a= input.nextInt();
        System.out.println("Factorial of given no is: "+ fact(a));

    }

    public static long fact(int num){
        if (num==1) return 1;
        return num * fact(num-1);

    }
}

class fibonacciRecursion{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int count = input.nextInt();
        for (int i=1;i<=count;i++){
            System.out.println(fib(i)+" ");
        }

    }
    public static int fib(int position){
    if (position ==1) return 0;
    if (position ==2) return 1;
    return (fib(position-1)+ fib(position-2));

    }
}





