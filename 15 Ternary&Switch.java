import java.util.Scanner;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int num1 = input.nextInt();
        System.out.print("Enter The second no: ");
        int num2 = input.nextInt();
        int max;
        if (num1 > num2) {
            max = num1;
        } else max = num2;
        System.out.println(max + " is the greatest");

        // Use ternary Operator instead:

//        max = num1>num2 ? num1 : num2;
        System.out.println(max + " is the greatest");
    }
}

class Switch_Old{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Day in No. and check for day: ");
        int day = input.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Valid day");
                break;
        }

    }
}

// After Java 12 new type of switch was introduced.

class Switch_New{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        String Day = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Enter valid day";
        };
        System.out.println(Day);
    }
}
