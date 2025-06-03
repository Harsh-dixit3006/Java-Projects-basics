import java.util.Scanner;

class Exception_Handling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[4];
        System.out.println(arr[5]);
        int a = input.nextInt();
        int b = input.nextInt();
        try{
        int c = a/b;
        System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.printf("%s ,%s, Please check the input if it is Zero?",
                    exception.getCause(), exception.getMessage());
        }finally {
            System.out.println("Finally Done!!");
        }
    }
}
