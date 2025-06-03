import java.util.Scanner;

class UserInput {
    public static void main (String[] args){
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name= in.nextLine();
        System.out.println("Hello "+ Name + " Welcome to SRDIC ");

    }
}
