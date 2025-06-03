import java.util.Scanner;

class _WhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100){
            System.out.println(num);
            num++;
        }
    }
}

class factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int p=1;
        while (a>=1){
            p = p * a;
            a--;
        }
        System.out.println(p);
    }
}


class SumOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No: ");
        int a = input.nextInt();
        int sum =0;
        while (a>0){
            int x = a%10;
            sum+=x;
            a = a / 10;
        }
        System.out.println(sum);
    }
}

class HCF{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int min;
        int hcf=1;
        min = Math.min(num1, num2);
        int i = 1;
        while (i<=min){
            if (num1%i==0 && num2 % i==0){
                hcf=i;
            }
            i++;
        }
        System.out.println(hcf);
    }
}


class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The first No: ");
        int num1 = input.nextInt();

        System.out.print("Enter The first No: ");
        int num2 = input.nextInt();

        int max=Math.max(num1,num2);
        int min=Math.min(num1,num2);

        int lcm=1;
//        int i =max;
//         while (i>=max){
//            if (i%num1==0 && i%num2==0 ){
//                lcm =i;
//                break;
//            }
//            i++;
//         }
//        System.out.println(lcm);
        if (max % min ==0){
            lcm= max;
        }
        else {
            lcm =max*min;
        }
        System.out.println(lcm);
    }
}


class ReverseOfDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No: ");
        int a = input.nextInt();
        int sum =0;
        while (a>0){
            int x = a%10;
            sum= (sum*10) +x;
            a = a / 10;
        }
        System.out.println(sum);
    }
}





