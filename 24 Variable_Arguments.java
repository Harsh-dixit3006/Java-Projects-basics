import java.util.Scanner;

class Variable_Arguments {
    public static void main(String[] args) {
        System.out.println(sum(1,2,5,6));

    }
    public static int sum(int a,int b ,int... c){
        int sum=a+b;
        for (int i : c) {
            sum+=i;
        }
        return sum;
    }
}
