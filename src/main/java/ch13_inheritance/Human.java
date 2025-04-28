package ch13_inheritance;
/*
    1. Animal 클래스를 상속 받으시오.
    2. 기본 생성자를 이용하여 main에서 human1 객체를 생성하시오.
        - 기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다. 라고 출력될 수 있도록 코드를 작성하시오.
    3. setter를 활용하여 animalName에 여러분 이름 / animalAge에 여러분 나이를 작성하시오.
    4. getter를 활용하여 재정의하여 getAnimalName();을 호출했을 때,
        안녕하세요. 제 이름은 ___입니다. 라고 출력될 수 있도록 코드를 작성하시오.
    5. getter를 재정의하여 getAnimalAge();를 호출했을 때,
        올해 제 나이는 n살입니다. 내년에는 n+1살이 됩니다. 라고 출력될 수 있도록 코드를 작성하시오.
    6. move() 메서드를 재정의하여
        사람이 두 발로 걷습니다. 라고 출력될 수 있도록 코드를 작성하시오.
    7. Human 클래스의 고유 메서드인 read() 메서드를 call2() 유형으로 정의하시오.
        human1.read("자바의 기초"); 라고 출력했을 시
        여러분이름은 자바의 기초를 읽는 중입니다. 라고 출력될 수 있도록 코드를 작성하시오.

    실행 예
    기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요. 제 이름은 ___입니다.
    올해 제 나이는 n살입니다. 내년에는 n+1살이 됩니다.
    여러분이름은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal {

    private String animalName;
    private int animalAge;

    public Human() {
        System.out.println("기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.");
    }

    @Override
    public String getAnimalName() {
        return "안녕하세요. 제 이름은 " + super.getAnimalName() +"입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.getAnimalAge() +"살입니다. 내년에는 " + (super.getAnimalAge() + 1) + "살이 됩니다.");
        return animalAge;
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book) {
        System.out.println(super.getAnimalName() + "은 " + book + "를 읽는 중입니다.");
    }
}
