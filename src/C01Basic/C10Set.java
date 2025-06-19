package C01Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C10Set {
    public static void main(String[] args) {
//        중복x, 순서보장x
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");

        System.out.println(mySet);

//    LinkedHashSet : 입력순서 보장
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(1);
        linkedSet.add(0);
        linkedSet.add(3);
        linkedSet.add(1);
        System.out.println(linkedSet); // 1 0 3
//    TreeSet : 데이터를 오름차순 정렬
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet); // 0 1 3

//        집합관련함수 : 교집합(retaunAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("C++");

        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");
//        set1.retainAll(set2); // set1에는 java만 남음
//        System.out.println(set1);
//        set1.addAll(set2);
        System.out.println(set1); // java, python, c++, html, css
        set1.removeAll(set2);
        System.out.println(set2); // python, c++


    }
}
