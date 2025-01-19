package algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {4, 2, 3, 1};
        System.out.println("정렬 전 : " + Arrays.toString(arr));
        bubbleSort.bubbleSort(arr);
    }

    /**
     * 버블 정렬 -> O(n2)성능
     * 인접한 두 숫자를 비교하며 정렬하는 알고리즘
     * 배열의 앞쪽부터 뒤쪽까지 숫자를 비교해 자리를 교체하고, 매번 마지막에 정렬된 숫자는 제외시키면서 정렬
     *
     * 장점 : 이해와 구현이 간단
     * 단점 : 데이터가 늘어날 수록 계산이 늘어나는 구조 = 성능이 좋지 못함
     */
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }

}
