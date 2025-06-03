import java.util.Scanner;

class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        float b = a<<2;
        System.out.print(b);
    }
}
class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        float b = a>>2;
        System.out.print(b);
    }
}


// Odd Even using Bitwise operator.

class odd_Or_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the No.");
        int a= input.nextInt();
        if ( (a & 1)==0){
            System.out.print("Your no. is even");
        }
        else{
            System.out.println("Your no is odd");
        }

    }
}






