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

class pattern4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the No. of Rows: ");
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int x){
        for (int i = 0; i < x; i++) {
            for (int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

class pattern5{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int x){
        for (int i=0;i<x;i++){
            for (int j=1;j<=x-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class pattern6{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int x){
        for (int i=1;i<=x;i++){
            for (int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class pattern7{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("-");
            }
            for (int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

class pattern8{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

class pattern9{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;
            stars=i;
            if(i>n) stars=2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

class pattern10{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int start =1;
            if(i%2==0) start =0;
            for (int j = 1; j <= i; j++) {
                System.out.print(start+" ");
                start=1-start;

            }
            System.out.println();
        }
    }
}

class pattern11{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        int space = 2*(n-1);
        for (int i = 1; i <= n; i++) {

            //numbers
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }

            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i;j>0;j--){
                System.out.print(j);
            }

            System.out.println();
            space=space-2;
        }
    }
}

class pattern12{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        int start =1;
        for (int i = 1; i <= n; i++) {
            int s=start;

            for (int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                s++;

            }
            start=start+(i);
            System.out.println();
        }
    }
}

class pattern13{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int start=65;

            for (int j = 1; j <= i; j++) {
                char s= (char) start;
                System.out.print(s);
                start++;

            }
            System.out.println();
        }
    }
}

class pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }

    public static void pattern(int n) {
        int start=1;
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = (n -i); j > 0; j--) {
                System.out.print(" ");
            }

            //Stars
            for(int j=1;j<=i;j++) {
                int a=65+(j-1);
                char x=(char)a;

                System.out.print(x);

            }

            for(int j=i-1;j>0;j--){
                int a=65+(j-1);
                char x=(char)a;
                System.out.print(x);
            }

            //Space
            for (int j = (n -i); j > 0; j--) {
                System.out.print(" ");
            }
            start=start+2;
            System.out.println();
        }
    }
}

class pattern15{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int start;
            start=n-i+1;
            for (int j = 1; j <= i; j++) {

                int y=64+start+j-1;
                char x= (char)y;

                System.out.print(x+" ");

            }

            System.out.println();
        }
    }
}

class pattern16{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        int start=0;
        for (int i = 1; i <= n ; i++) {
            //Star
            for(int j=n-i;j>=0;j--){
                System.out.print("*"+ " ");
            }
            //Space
            for(int j=0;j<start;j++){

                System.out.print(" ");
            }
            //Star
            for(int j=n-i;j>=0;j--){
                System.out.print("*"+ " ");
            }
            if(start<=2*(n-1)) start=start+2;
            System.out.println();
        }
        int end= 2*(n-1);
        for (int i = 1; i <= n ; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            //Space
            for(int j=0;j<end;j++){

                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            if(end>0) end=end-2;
            System.out.println();


        }

    }
}

class pattern17{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;
            stars=i;
            if(i>n) stars=2*n-i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

class pattern18{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
           for(int j=0;j<n;j++){
               if(i==0 || i==n-1 || j==0 || j==n-1){
                   System.out.print("*");
               }
               else System.out.print(" ");
           }
            System.out.println();
        }
    }
}



class pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        pattern(row);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




































