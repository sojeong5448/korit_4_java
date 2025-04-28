package ch12_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 비어있는 String 배열을 10개짜리 만들겁니다.

        // 0번지에 김영 1번지에 김일 ... 3번지에 김삼까지
        // Scanner로 입력할 수 있도록 작성하겠습니다.
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];

        // 주소지에 값을 대입하기 위한 반복문 작성
        for(int i = 0; i < names.length; i++) {
            System.out.print(i + "번지에 들어갈 이름 작성 >>>");
            names[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(names));

    }
}
