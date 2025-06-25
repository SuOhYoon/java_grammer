package C06EtcClass;

import java.util.Arrays;

public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stchange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer [] intArr = {10, 20, 30};
        intchange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        allchange(stArr, 0, 1);
        allchange(intArr, 0, 1);
    }

//    제네릭메서드는 반환타입 왼족에 <T>라고 선언
//    이때 T에는 참조형 변수인 객체타입만을 허용
    static<T> void allchange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void stchange(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void intchange(int[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
