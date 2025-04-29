package ch15_casting.control;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("검퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("검퓨터의 전원을 끕니다.");
    }
}
