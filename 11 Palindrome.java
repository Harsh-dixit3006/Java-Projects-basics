import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No: ");
        int num = input.nextInt();
        if(reverse(num)== num){
            System.out.println("The no. is Palindrome");
        }
        else System.out.println("the No. is Not Palindrome");

    }
    public static int reverse(int a){
        int sum =0;
        while (a>0){
            int x = a%10;
            sum= (sum*10) +x;
            a = a / 10;
        }
        //System.out.println(sum);
        return sum;
    }
}
