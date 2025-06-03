import java.util.Scanner;

class StringFormate {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 4565;
        System.out.println("Hello "+ name +" your marks are: "+ marks);

        System.out.printf("Hello %10S Your marks are: %d",name,marks);
        System.out.printf("Hello %-10S Your marks are: %d",name,marks);
    }
}

class StringTest{
    public static void main(String[] args) {
        StringBuilder name= new StringBuilder("Hello Harsh");
        name.append(", How Are You?");
        System.out.println(name.reverse());

    }
}

class FinalKeyword{
    public static void main(String[] args) {
        final double PI=3.14;
//        PI=4.21; // Showing Error because of final Keyword.
    }
}

class StringConcatenate{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FirstName= input.nextLine();
        String LastName= input.nextLine();
//        String Name = FirstName.concat(" ").concat(LastName)
        String Name = FirstName.concat(" ").concat(LastName);
        System.out.println(Name.toUpperCase());

    }
}