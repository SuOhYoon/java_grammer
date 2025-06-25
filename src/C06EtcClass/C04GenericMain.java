package C06EtcClass;

import java.util.Arrays;

public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stchange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        int[] intArr = {10, 20, 30};
        intchange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));
    }

    static void stchange(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void stchange(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void intchange(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
