import java.util.Scanner;

class Patterns1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. of Rows: ");
        int rows= input.nextInt();
        pattern(rows);
    }

    public static void pattern(int r){
        int q=0;
        while(q<r){
            System.out.print("*");
            int i=0;
            while (i < q){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            q++;
        }
    }
}



class Patterns2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. of Rows: ");
        int rows= input.nextInt();
        pattern(rows);
    }

    public static void pattern(int r){
        int rows = r;
        while(rows>0){
            int i=0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}


class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. of rows");
        int rows = input.nextInt();
        pattern(rows);
    }

    public static void pattern(int maxrows){
        int rows = maxrows;
        while(rows>0){
            int i=0;
            while(i<rows-1){
                System.out.print((" "));
                i++;
            }
            int j=0;
            while(j<=(maxrows-rows)){
                System.out.print(("*"));
                j++;
            }
            System.out.println();
            rows--;

        }
    }

}

