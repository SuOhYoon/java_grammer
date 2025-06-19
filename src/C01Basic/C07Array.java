package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 배열 선언 후 할당 방식
//        배열은 반드시 사전에 길이가 결정되어야 함.
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[3] = 40;
        arr1[4] = 50;
//        arr1[5] = 10; //index out of bounds 예외 발생. 배열길이가 동적으로 늘어날 수 없음
        System.out.println(arr1[2]); // int배열의 경우 0으로, String배열은 null로 초기화
////        배열표현식2. 리터럴 방식
//        int[] arr2 = {10,20,30,40,50};
//
////        배열표현식3.
//        int[] arr3 = new int[]{10,20,30,40,50};
////        배열표현식3.예시
//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1, 3, 5, 7});
//
//        System.out.println(list.get(1)[3]);
//
////        베열표현식4. 불가 -> 배열의 길이를 반드시 확정시켜야함.
//          int[] arr4 = new int[];

//          Arrays.fill : 배열의 모든 값을 변경
        String[] arr = new String[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = " ";
//        }
        Arrays.fill(arr, "");
        for (String str : arr) {
            System.out.println(str);
        }
//        85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오.
        int[] scores = {85, 65, 90};
        int sum = 0;
        int avg = 0;

        for (int num : scores) {
            sum += num;
        }

        avg = sum / scores.length;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
//    배열의 최대값, 최소값
//        int max = scores[0];
//        int min = scores[1];
//
//        for(int i=0;i<scores.length;i++){
//            if(max < scores[i]){
//                max = scores[i];
//            }
//
//            if(min > scores[i]){
//                min = scores[i];
//            }
//        }
//
//        System.out.println("최대값 : " + max);
//        System.out.println("최소값 : " + min);

////        배열의 자리 바꾸기
//        int[] arr3 = {20, 10, 30};
//        int temp = arr3[0];
//        arr3[0] = arr3[1];
//        arr3[1] = temp;
//        System.out.println(Arrays.toString(arr));
//        배열 뒤집기
//        int[] arr4 = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        int count = 0;
//
//        for(int i=arr4.length-1;i>=0;i--){
//            newArr[count] = arr4[i];
//            count++;
//        }
//
//        System.out.println(Arrays.toString(newArr));

//        배열 정렬
        int[] arr5 = {17, 12, 20, 10, 15};
//        Arrays.sort(arr5);
//        Arrays.sort(arr5, Comparator.reverseOrder()); 불가능, 원시자료형은 Comparator사용불가
//        System.out.println(Arrays.toString(arr5));
//
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순
//        System.out.println(Arrays.toString(stArr));

//        선택정렬 알고리즘 직접 구현
//        for(int i=0;i<arr5.length;i++){
//            int min = i;  // 현재 값을 최소값으로 초기화
//            for(int j = i+1;j<arr5.length;j++){
//                if(arr5[min] > arr5[j]) {
//                    min = j;
//                }
//            }
//            // 최소값과 현재 위치 값 교환
//            int temp = arr5[i];
//            arr5[i] = arr5[min];
//            arr5[min] = temp;
//        }
//        System.out.println(Arrays.toString(arr5));
//
//        int[] inArr = {10, 20, 30, 40, 50};
//        for(int i=0;i<inArr.length;i++){
//            for(int j=i+1;j<inArr.length;j++){
//                System.out.print("(" + inArr[i] + ", " + inArr[j] + ") ");
//            }
//        }

//        배열의 검색
//        int[] arr6 = {5, 3, 1, 8, 7};
//        int target = 8;
////        8이 몇번째 index에 있는지 출력
//        for(int i=0;i<arr6.length;i++){
//            if(arr6[i] == target){
//                System.out.println(i);
//                break;
//            }
//        }
//        이진검색(이분탐색) - binary search
        int[] arr7 = {1, 3, 6, 8, 9, 11, 15};
//        System.out.println(Arrays.binarySearch(arr, 15));

//        배열값 비교
        int[] arrA = {10, 20, 30};
        int[] arrB = {10, 20, 30};

        System.out.println(arrA==arrB);
        System.out.println(Arrays.equals(arrA, arrB));

//        2차원 배열의 선언과 값 할당
        int[][] arr8 = new int[3][2];
        arr8[0][0] = 1;
        arr8[0][1] = 2;
        arr8[1][0] = 3;
        arr8[1][1] = 4;
        arr8[2][0] = 5;
        arr8[2][1] = 6;

//        리터럴 방식
        int[][] arr9 = {{1,2},{3,4},{5,6}};
//        가변배열 : 배열의 전체길이는 반드시 할당
        int[][] arr10 = {{1,2},{1,2,3},{1,2,3,4}};

//
        int[][] arr11 = new int[3][];
        arr11[0] = new int[2];
        arr11[1] = new int[3];
        arr11[2] = new int[4];

//        2차원 배열의 출력
        System.out.println(arr10); // 2차원 배열의 주소값
        System.out.println(Arrays.toString(arr10)); // 각 1차원 배열의 주소값 모음
        System.out.println(Arrays.deepToString(arr10)); // 각 1차원 배열의 값을 출력

//        [3][4] 사이즈 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        int[][] arr12 = new int[3][4];

        int num = 1;
        for(int i=0;i<arr12.length;i++){
            for(int j=0;j<arr12[i].length;j++){
                arr12[i][j] = num;
                num++;
            }
        }

        System.out.println(Arrays.deepToString(arr12));

//        가변배열 값 채우기
        int[][] arr13 = new int[3][];
        for(int i=0;i<arr13.length;i++){
            for(int j=0;j<arr13.length;j++){

            }
        }

//        행렬의 덧셈 - 프로그래머스
        class Solution {
            public int[][] solution(int[][] arr1, int[][] arr2) {
                int[][] answer = new int[arr1.length][];

                for(int i=0;i<arr1.length;i++){
                    answer[i] = new int[arr1[i].length];
                    for(int j=0;j<arr1[i].length;j++){
                        answer[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                return answer;
            }
        }
//        K번째 수
//        배열복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
    }
}
