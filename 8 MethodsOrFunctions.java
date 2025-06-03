import java.util.Scanner;

class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The first no: ");
        int num1 = input.nextInt();

        System.out.print("Enter The second no: ");
        int num2 = input.nextInt();

        System.out.println(sum(num1,num2));
    }

    public static int sum (int first,int second){
        System.out.print("Sum Of two no's. are: ");
         return first + second;
    }
}


class factorial1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fact((num)));


    }
    public static int fact(int x){
        int p=1;
        while (x>=1){
            p = p * x;
            x--;
        }
        return p;
    }
}





