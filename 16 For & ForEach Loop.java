import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i=0;i<a;i++){
            System.out.println("Hello");
        }
    }
}

class ForEach{
    public static void main(String[] args) {
        String[] arr= new String[]{"Harsh","Adarsh","Akarsh"};
        printEach(arr);
    }
    public static void printEach(String[] array){
        for (String name: array){
            System.out.println(name);
        }
    }
}

class power2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b=a;
        int count = 0;
        while (a > 1) {
            if (a % 2 == 0) {
                count++;
                a = a / 2;
            }
            else {
                System.out.println(b + " is not in power of 2");
                break;
            }

        }
        System.out.println(count);
    }
}

