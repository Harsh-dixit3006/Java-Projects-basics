import java.util.Scanner;

class ArmstrongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if (IsArm(a)==a){
            System.out.println("Yes The no. is Armstrong No");
        }
        else System.out.println("No the is not Armstrong No");

    }
        public static int NoOfDigits(int a){
            int count=0;
            while (a>0){
                count++;
                a=a/10;
            }
            //System.out.println(count);
            return count;

        }

        public static  int pow(int num1, int num2) {
            int result = 1;
            int i = 0;
            while (i < num2) {
                result *= num1;
                i++;
            }
            //System.out.println(result);
            return result;

        }


        public static int IsArm(int y){
        int digits= NoOfDigits(y);
            int c=0;
            while (y>0){
                int x= y % 10;
                c= c+ pow(x,digits);
                y=y/10;
            }
            //System.out.println(c);
            return c;

        }



}




