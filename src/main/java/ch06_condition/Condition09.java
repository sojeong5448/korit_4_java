package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.print("연도를 입력하세요 >>> ");
        year = scanner.nextInt();
        String leapYear = "";

        // 논리 연산자 사용
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = "윤년입니다.";
        } else {
            leapYear = "윤년이 아닙니다.";
        }

        System.out.println(year + "년은 " + leapYear);
    }
}
