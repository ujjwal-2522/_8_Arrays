import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

//        // ARRAY OF PRIMITIVES
//        int[] arr= new int[5];
//        arr[0]=23;
//        arr[1]=4;
//        arr[2]=45;
//        arr[3]=46;
//        arr[4]=47;
//        //[23,4,45,46,47]
//        System.out.println(arr[3]);
//        //input using for loop
//        for(int i=0;i<arr.length;i++){
//            arr[i]= in.nextInt();
//        }
//        //3 WAYS TO PRINT ARRAYS
//
//        //1
//        System.out.println(Arrays.toString(arr));
//
//        //2
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//        //3
//        for (int j : arr) { // for every element in array, print the element
//            System.out.print(j + " ");//here j represent element of the array
//        }
//        //System.out.println(arr[5]);  // Index out of bound error

        // ARRAY OF OBJECTS
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1]="ujjwal";
        System.out.println(Arrays.toString(str));

    }

}
