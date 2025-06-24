package C05AnonymousLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamAPi {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 12};
//        전통적인 방식의 데이터 접근방법 : 메모리 주소접근
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        함수형 프로그램 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        streamApi : java에서 함수형프로그래밍을 지원하는 라이브러리
//        foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        스트림의 생성 : .stream()
        List<String> myList = new ArrayList<>();
        myList.add("HTML");
        myList.add("CSS");
        myList.add("javascript");
        Stream<String> stream1 = myList.stream();
        String[] myArr = new String[3];
        myArr[0] = "HTML";
        myArr[1] = "CSS";
        myArr[2] = "javascript";
        Stream<String> stream2 = Arrays.stream(myArr);

//        원시자료형을 위한 stream객체가 별도로 존재.
        int[] intArr = {10,20,30,40,50};
        IntStream stream3 = Arrays.stream(intArr);
//        30보다 작은 값들의 총합
//        filter : 특정기준을 대상을 filtering하여 새로운 스트림 반환하는 중개연산 메서드
//        sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
        int total = Arrays.stream(intArr).filter(a->a<=30).sum();
        System.out.println(total);
    }
}
