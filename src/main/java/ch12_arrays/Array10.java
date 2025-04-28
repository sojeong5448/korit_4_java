package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        // 이상의 2차 배열에 1 ~ 100 까지 값을 집어넣으시오.

        // Arrays.deepToString(nums); 를 통해 출력하시오.
        // 실행 예
        /*
            [
                [1,2,3,4,5],
                [6,7,8,9,10],
                ...
                [..., 100]
            ]
         */

        for(int i = 0, k = 1; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                nums[i][j] = k;
                k++;
            }
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
