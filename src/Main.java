import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //syntax
        // datatype[] var_name= new datatype[size];

//        int[] rno=new int[5];
//        //or directly
//        int[] rno1={4,5,6,7,8};

        int[] rno; //declaration of array. rno is getting defined in stack
        rno=new int[5]; //intialisation :actually here object is being created in memory(heap)

        String[] name;
        name=new String[4];
        System.out.println(name[1]);

        for (String element:name){
            System.out.println(Arrays.toString(element));
        }


    }
}