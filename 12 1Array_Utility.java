
//USed For initializing 1d and 2D array and calling in other classes to reduce lines of code.

import java.util.Scanner;

class array_Utility {
    public static int[] ArrayInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The size Of Array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i=0;
        while (i<size){
            System.out.print("Enter the element no. "+ (i+1) +": ");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;
    }
    public static void display(int[] arr){
        int i=0;
        while(i< arr.length){
            System.out.print(" "+arr[i]);
            i++;
        }
    }

    public static int[][] Array2D(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The no. Of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter The no. of Columns: ");
        int columns= input.nextInt();
        int[][] NewArray= new int[rows][columns];
        int i=0;
        while (i<rows){
            int j=0;
            while (j<(columns)) {
                System.out.print("Enter the element of row "+ (i+1)+ " & column "+(j+1)+": ");
                NewArray[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return NewArray;
    }
}


