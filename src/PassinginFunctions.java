import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] num={3,45,67,75,56};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr){
      arr[1]=78;
    }
}
