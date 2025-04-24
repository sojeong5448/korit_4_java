package ch09_classes;

import java.util.Scanner;

public class ClassA {
    int num;
    String name;
    double score;

    public void callName() {        // public static void가 아니네요
        System.out.println(name + "을 부릅니다.");
    }

    public void displayProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("번호를 입력하세요 >>> ");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextDouble();

        System.out.println("[ 실행 결과 ]");
        System.out.println(num + " 학번의 학생의 이름은 " + name + "이고, " + score + "점입니다.");
    }

}
