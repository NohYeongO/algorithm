package algorithm.recursion;

public class Recursion {

    /**
     * 재귀 함수 : 자신을 호출하는 것
     */
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        //recursion.function(1);
        System.out.println(recursion.factorial(5));
    }

    // 스택에 쌓아서 위에부터 순서대로 출력되는 구조
    public void function(int number){
        if(number > 10) return;
        System.out.println(number);
        function(number+1);
    }

    /**
     * 재귀함수를 사용할 경우 메모리를 많이 사용하는 단점 존재
     * 하지만 팩토리얼을 구현할때 쉽게 구현 가능
     * Factorial : n 이 주어졌을 때 1 부터 n까지 모든 수의 곱
     * ex) 5! = (5 * 4 * 3 * 2 * 1)
     */
    public int factorial(int number){
        if(number <= 1) return 1;
        return number * factorial(number-1);
    }

}
