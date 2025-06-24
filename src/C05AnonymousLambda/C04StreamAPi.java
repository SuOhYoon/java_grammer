package C05AnonymousLambda;

import java.util.Arrays;

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
    }
}
