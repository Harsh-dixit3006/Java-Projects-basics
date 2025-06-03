import java.util.Arrays;
import java.util.Scanner;

class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = array_Utility.ArrayInput();
        int[] NewArray= NewArray(arr);
        int j=0;
        while (j<NewArray.length){
            System.out.print(" "+NewArray[j]);
            j++;
        }
    }
    public static int[] NewArray(int[] arr){
        int[] reverse= new int[arr.length];
        int i=0;
        int j=arr.length-1;
        while (i<arr.length){
            reverse[i]= arr[arr.length-i-1];
                    i++;
        }
        return  reverse;

    }
}

class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = array_Utility.ArrayInput();
        int[] NewArray= NewArray(arr);
        int j=0;int k=0; int count=0;
        while (j<NewArray.length){
            if (arr[j]==NewArray[k])
                count++;
            j++;k++;
        }
        if (count== arr.length){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
    public static int[] NewArray(int[] arr){
        int[] reverse= new int[arr.length];
        int i=0;
        int j=arr.length-1;
        while (i<arr.length){
            reverse[i] = arr[arr.length-i-1];
            i++;
        }
        return  reverse;

    }
}


class MergeArray{
    public static void main(String[] args) {
        int[] arr1= array_Utility.ArrayInput();
        int[] arr2 = array_Utility.ArrayInput();
        array_Utility.display(Merge(arr1,arr2));

    }
    public static int[] Merge(int[] arr1, int[] arr2){
        int Size= arr1.length + arr2.length;
        int[] MergedArray= new int[Size];
        int i=0,j=0,k=0;
        while (i< arr1.length || j< arr2.length){
            if(j == arr2.length || (i <arr1.length && arr1[i]<arr2[j])){
                MergedArray[k]=arr1[i];
                i++;
            }
            else {
                MergedArray[k]=arr2[j];
                j++;
            }
            k++;
        }
        return MergedArray;
    }
}

class Search2DArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Array= array_Utility.Array2D();
        System.out.print("Enter The No. You Want to search: ");
        int num = input.nextInt();
        if(IsPresent(Array,num)){
            System.out.println("Yes, No. is Present ");
        }
        else System.out.println("No, the no. Is not present");
    }
    public static boolean IsPresent(int[][] Array,int num){
        int i=0,j=0;
        while (i<Array.length){
            while (j< Array[i].length){
                if (Array[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}


















class sortedArray{
    public static void main(String[] args) {
        int [] arr1= array_Utility.ArrayInput();
        int [] arr2= array_Utility.ArrayInput();
        array_Utility.display(sortedMergedArray(mergedArray(arr1,arr2)));

    }
    public static int[] mergedArray(int[] arr1, int[] arr2){
        int newSize= arr1.length + arr2.length;
        int [] newArray = new int[newSize];
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length || j<arr2.length){
            if(i<arr1.length){
                newArray[k]=arr1[i];
                i++;
            }
            else{
                newArray[k]=arr2[j];
                j++;
            }
            k++;
        }
        return newArray;
    }
    public static int [] sortedMergedArray(int[] arr1){
        Arrays.sort(arr1);
        return arr1;
    }

}



