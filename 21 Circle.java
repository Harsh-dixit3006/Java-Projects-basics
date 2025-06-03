import java.util.Scanner;

class Circle {

    double Radius;

    public Circle(double radius) {
        this.Radius = radius;
    }

    double Circumference(){
        return 2* Math.PI*Radius;
    }
    double Area(){
        return Math.PI* Math.pow(Radius,2);
    }

    @Override
    public String toString() {
        return "The area Of given Circle is :"+Area()+"\n"
                +"The circumference of given Circle is :"+Circumference();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Radius: ");
        float radius = input.nextFloat();
        Circle output = new Circle(radius);
        System.out.println(output);
    }
}


