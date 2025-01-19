package algorithm.recursion;

public class recursion {

    /**
     * 재귀 함수 : 나 자신을 호출하는 것
     */

    public static void main(String[] args) {
        function(1);
    }

    // 스택에 쌓아서 위에부터 순서대로 출력되는 구조
    public static void function(int number){
        if(number > 10) return;
        System.out.println(number);
        function(number+1);
    }
}
