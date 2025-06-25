package C06EtcClass;

public class C01Math {
    public static void main(String[] args) {
//        Math.random() : 임의의 수 반환. 0.0~1.0사이의 double형 반환
        System.out.println(Math.random());
        for(int i=0;i<7;i++){
            System.out.println((int)(Math.random()*100));
        }

//        Math.abs(() : 절대값 반환
//        Math.ceil() : 올림, Math.floor() : 내림, Math.round() : 반올림
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

//        Math.max(a, b) : 두수의 최대값. Math.min(a, b) : 두수의 최소값
        System.out.println(Math.max(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20

//        Math.pow(a, b) : a의 b제곱(b가 승수)
        System.out.println(Math.pow(2, 3));
//        Math.pow(a, b) : a의 b제곱(b가 승수)
        System.out.println(Math.pow(2, 3));
    }
}
