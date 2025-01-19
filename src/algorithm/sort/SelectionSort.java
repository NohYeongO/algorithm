package algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {4, 2, 3, 1};
        System.out.println("정렬 전 : " + Arrays.toString(arr));
        selectionSort.selectionSort(arr);
    }

    /**
     * 선택정렬 -> O(n2)성능
     * 배열에서 가장 작은 값을 찾아 첫 번째 위치와 교환한 후,
     * 다음 위치부터 반복하여 작은 값을 다음 위치와 교환하면서 정렬하는 방식의 알고리즘
     *
     * 장점 : 이해와 구현이 간단
     * 단점 : 데이터가 늘어날 수록 계산이 늘어나는 구조 = 성능이 좋지 못함
     */
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }

}
