import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter The value of b:  ");
        int b = input.nextInt();
        int c= a;
        a=b;
        b=c;
        System.out.println("The Swapping is done and given are the results");
        System.out.println("Value of a="+ a );
        System.out.print("Value Of b="+ b );

    }
}
