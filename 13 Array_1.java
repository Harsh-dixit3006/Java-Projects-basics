import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr= new int [5];
//        arr[0]=102;
//        arr[1]=202;
//        arr[2]=302;
//        arr[3]=402;
//        arr[4]=502;
        int [] arr={101,102,103,104,105};

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        int i=0;
        while (i<5){
            System.out.println(arr[i]);
            i++;
        }
    }
}

class searchArr{
    public static void main(String[] args) {
        System.out.print("Welcome to array searching enter the no.: ");
        Scanner input = new Scanner(System.in);
        int[] arr={55,66,77,88,99};
        int num = input.nextInt();
        boolean isFound=isFound(arr,num);
        if (isFound){
            System.out.println("Your No was Found ");
        }
        else System.out.println("You No. was not found");
    }
    public static boolean isFound(int[] arr, int n){
        int i=0;
        while (i< arr.length){
            if (arr[i]==n) {
                return true;
            }

            i++;
        }
        return false;
    }
}


class sumArr{
    public static void main(String[] args) {
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
        int j=0;
        int s=0;
        while (j<size){
            s=s+arr[j];
            j++;
        }
        System.out.println();
        System.out.println("Sum of all elements is: "+ s);
        System.out.println("Avg of all elements is: "+ s/(arr.length));
    }

}

class No_Of_Occur{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the no to check for the no. of occurances: ");
        int num = Input.nextInt();
        int [] arr={22,23,24,21,22,21,22,24,25,25,25,25,26};
        int count =0;
        int i=0;
        while (i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        System.out.println("No. OF Count of the given no is: "+ count);

    }
}


class Max_Min{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int [] arr={22,23,24,21,22,21,22,24,25,25,25,25,26};
        int max =arr[0];
        int min =arr[0];
        int i=0;
        while (i<arr.length){
            if(max<arr[i]) {
                max=arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
            i++;
        }
        System.out.println("Min Of the given Array is: "+ min);
        System.out.println("Max Of the given Array is: "+ max);

    }
}

class IsSorted{
    public static void main(String[] args) {
        int[] arr = array_Utility.ArrayInput();
        boolean IsInc= IsIncreasing(arr);
        boolean IsDec= IsDecreasing(arr);

        if(IsInc) System.out.println("Your array is Sorted in Incresing order.");
        else if(IsDec)  System.out.println("Your array is Sorted in decresing Order.");
        else System.out.println(("Your Array Is not sorted"));
    }

    public static boolean IsIncreasing(int [] arr){
        int i=1;
        while (i<arr.length){
            if (arr[i]<=arr[i-1]){
                return false;
            }
            i++;

        }
        return true;
    }

    public static boolean IsDecreasing(int [] arr){
        int i=1;
        while (i<arr.length){
            if (arr[i]>=arr[i-1]){
                return false;
            }
            i++;

        }
        return true;
    }
}

class DeleteElement{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr = array_Utility.ArrayInput();
        System.out.print(("Enter The No. You Want to delete: "));
        int num = input.nextInt();
        int[] NewArray = deletedArray(arr,num);
        int i=0;
        while (i<NewArray.length){
            System.out.print ( NewArray[i]);
            i++;
        }

    }
    public static int[] deletedArray(int[] arr,int NumToDelete){
        int count =0;
        int i=0;
        while (i<arr.length) {
            if (arr[i] == NumToDelete) {
                count++;
            }
            i++;
        }
        int[] UpdatedArray= new int[arr.length-count];
        int j=0;
        int k=0;
        while (k< arr.length){
            if(arr[k]!=NumToDelete){
                UpdatedArray[j]=arr[k];
                j++;
            }
            k++;
        }
        return UpdatedArray;
    }
}









