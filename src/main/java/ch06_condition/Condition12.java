package ch06_condition;

import java.util.Scanner;

/*
    Condition07 파일을 확인하시면
    점수를 입력 받아서 등급을 산출 했었습니다.
    이를 응용하여 중첩 if문 + switch문 형태로 프로그램을 작성합니다.

    지시 사항
    사용자에게 score을 입력 받아서 다음과 같은 조건을 만족시키도록 작성하시오.
    score가 0미만이거나 100 초과라면 grade = x

    changeScore = 9 ~ 10, grade = A
    changeScore = 8, grade = B
    changeScore = 7, grade = C
    changeScore = 6, grade = D
    changeScore = 5, 4, 3, 2, 1이면 grade = F

    실행 예
    점수를 입력하세요 >>> 100
    점수는 100점이고, 학점은 A학점입니다.
    changedScore = score / 10
 */
public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int changeScore;
        String grade = "";

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        changeScore = score / 10;

        if (score < 0 || score > 100) {
            System.out.println("점수를 잘못 입력하셨습니다.");
        } else {
            switch (changeScore) {
                case 9, 10 :
                    grade = "A";
                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7 :
                    grade = "C";
                    break;
                case 6 :
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
            System.out.println("점수는 " + score + "점이고, 학점은 " + grade + "학점입니다.");
        }


    }
}
